package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import io.github.piotr_janczukowicz.github.webhook.json.GitHubWebhookJsonMappers;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.jackson.core.JacksonException;
import tools.jackson.core.exc.StreamConstraintsException;
import tools.jackson.databind.JavaType;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.exc.MismatchedInputException;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.type.TypeFactory;

/**
 * Turns a webhook delivery (the {@code X-GitHub-Event} header and the raw body) into a typed event.
 *
 * <p>The header picks the family of the event and the {@code action} of the body picks the record. A new event, or a
 * new action, that this library version does not know never fails: it decodes to {@link GitHubWebhookUnknownEvent} or
 * to the {@code Unknown...ActionEvent} of its family, which carry the body as a map. So does a known event whose body
 * does not fit its record: a union this library version cannot resolve (a new {@code type} value, or properties that
 * fit no member), a property the specification requires that is missing or {@code null}, or a value of another JSON
 * type than the record has. A family with actions falls back to its unknown-action record, a family without actions to
 * {@link GitHubWebhookUnknownEvent}, and the delivery is kept as a map. The record of such a fallback does not say that
 * the event was known, so each one is logged at {@code WARN} (event, action, the failing property and why, never the
 * body) and {@link #decodeDelivery} reports it in {@link GitHubWebhookDelivery#fallbackReason()}. Only a body that is
 * empty, larger than 25 MiB, not a JSON object, or over a JSON limit (such as the nesting depth) throws
 * {@link GitHubWebhookDecodeException}. The header is compared exactly: {@code Push} is not {@code push}.
 *
 * <p>The decoder is thread-safe; build it once and share it.
 */
public final class GitHubWebhookDecoder {

    /** The largest body GitHub sends (25 MiB). */
    static final int MAX_BODY_BYTES = 25 * 1024 * 1024;

    private static final Logger LOG = LoggerFactory.getLogger(GitHubWebhookDecoder.class);
    private static final int MAX_REASON_LENGTH = 300;
    private static final String ACTION = "action";
    private static final String MISSING_PROPERTY = "Missing required creator property";
    private static final String DUPLICATE_KEY = "Duplicate";
    private static final JavaType PAYLOAD =
            TypeFactory.createDefaultInstance().constructMapType(Map.class, String.class, Object.class);

    private final JsonMapper mapper;

    private GitHubWebhookDecoder(final JsonMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Creates a decoder.
     *
     * @return a decoder that shares the webhook mapper
     */
    public static GitHubWebhookDecoder create() {
        return new GitHubWebhookDecoder(GitHubWebhookJsonMappers.defaults());
    }

    /**
     * Decodes one delivery.
     *
     * @param eventHeader value of the {@code X-GitHub-Event} header, or {@code null}
     * @param body the raw request body
     * @return the typed event, or an unknown event (also for a known event whose body does not fit its record, which is
     *     logged at {@code WARN})
     * @throws NullPointerException if {@code body} is {@code null}
     * @throws GitHubWebhookDecodeException if the body is empty, too large, not a JSON object, or over a JSON limit
     */
    public GitHubWebhookEvent decode(final @Nullable String eventHeader, final byte[] body) {
        requireNonNull(body, "body");
        final JsonNode root = parse(eventHeader, body);
        return route(eventHeader, root, new Payload(root)).event();
    }

    /**
     * Decodes one delivery and keeps its body next to the typed event, for a service that queues or forwards what it
     * received (the typed event alone drops unknown fields and the raw value of an unknown enum constant).
     *
     * @param eventHeader value of the {@code X-GitHub-Event} header, or {@code null}
     * @param body the raw request body
     * @return the typed event with the body as a map; {@link GitHubWebhookDelivery#fallbackReason()} tells why a known
     *     event was kept as an unknown one
     * @throws NullPointerException if {@code body} is {@code null}
     * @throws GitHubWebhookDecodeException if the body is empty, too large, not a JSON object, or over a JSON limit
     */
    public GitHubWebhookDelivery decodeDelivery(final @Nullable String eventHeader, final byte[] body) {
        requireNonNull(body, "body");
        final JsonNode root = parse(eventHeader, body);
        final Payload payload = new Payload(root);
        final Decoded decoded = route(eventHeader, root, payload);
        return new GitHubWebhookDelivery(eventHeader, decoded.event(), payload.get(), decoded.fallbackReason());
    }

    private Decoded route(final @Nullable String eventHeader, final JsonNode root, final Payload payload) {
        final GitHubWebhookFamily family = eventHeader == null ? null : GitHubWebhookFamilies.BY_EVENT.get(eventHeader);
        if (family == null) {
            return new Decoded(new GitHubWebhookUnknownEvent(eventHeader, payload.get()), null);
        }
        final Class<? extends GitHubWebhookEvent> single = family.single();
        if (single != null) {
            return read(single, family, root, eventHeader, null, payload);
        }
        final JsonNode actionNode = root.get(ACTION);
        final String action = actionNode != null && actionNode.isString() ? actionNode.stringValue() : null;
        final Class<? extends GitHubWebhookEvent> type =
                action == null ? null : family.actions().get(action);
        if (type != null) {
            return read(type, family, root, eventHeader, action, payload);
        }
        return new Decoded(family.unknown(eventHeader, action, payload.get()), null);
    }

    private JsonNode parse(final @Nullable String eventHeader, final byte[] body) {
        if (body.length == 0) {
            throw new GitHubWebhookDecodeException(eventHeader, null, "the body is empty", null);
        }
        if (body.length > MAX_BODY_BYTES) {
            throw new GitHubWebhookDecodeException(
                    eventHeader, null, "the body is larger than " + MAX_BODY_BYTES + " bytes", null);
        }
        final JsonNode root;
        try {
            root = mapper.readTree(body);
        } catch (JacksonException e) {
            throw new GitHubWebhookDecodeException(eventHeader, null, notJson(e), e);
        }
        if (!root.isObject()) {
            throw new GitHubWebhookDecodeException(eventHeader, null, "the body is not a JSON object", null);
        }
        return root;
    }

    private <T extends GitHubWebhookEvent> Decoded read(
            final Class<T> type,
            final GitHubWebhookFamily family,
            final JsonNode root,
            final @Nullable String eventHeader,
            final @Nullable String action,
            final Payload payload) {
        try {
            return new Decoded(mapper.treeToValue(root, type), null);
        } catch (JacksonException e) {
            final String reason = reasonOf(e);
            final String loggedEvent = PrintableText.ofNullable(eventHeader);
            final String loggedAction = PrintableText.ofNullable(action);
            LOG.warn(
                    "Webhook '{}' (action '{}') does not fit its record, kept as unknown: {}",
                    loggedEvent,
                    loggedAction,
                    reason);
            return new Decoded(family.unknown(eventHeader, action, payload.get()), reason);
        }
    }

    private static String notJson(final JacksonException failure) {
        if (failure instanceof StreamConstraintsException) {
            return "the body is over a JSON limit (nesting depth, string length or number length)";
        }
        return String.valueOf(failure.getOriginalMessage()).startsWith(DUPLICATE_KEY)
                ? "the body repeats a key"
                : "the body is not JSON";
    }

    /**
     * Why the body does not fit: the failing property and what is wrong, on one short line. The reason never carries a
     * value of the body: a value of the wrong type is described by the type that was expected, and a failure that is
     * not about a type (a number out of range, say) by a fixed phrase, because Jackson puts the value in its message.
     */
    private static String reasonOf(final JacksonException failure) {
        final String oneLine = PrintableText.of(whatOf(failure) + " at " + pathOf(failure));
        return PrintableText.limited(oneLine, MAX_REASON_LENGTH);
    }

    private static String whatOf(final JacksonException failure) {
        if (failure instanceof MismatchedInputException mismatch) {
            return isMissingProperty(mismatch)
                    ? String.valueOf(mismatch.getOriginalMessage())
                    : "a value has the wrong type, expected " + expected(mismatch);
        }
        return "a value cannot be read";
    }

    /** The property names and list indexes down to the failure, without the class names Jackson adds. */
    private static String pathOf(final JacksonException failure) {
        final StringBuilder path = new StringBuilder();
        for (final JacksonException.Reference step : failure.getPath()) {
            if (step.getIndex() >= 0) {
                path.append('[').append(step.getIndex()).append(']');
            } else {
                path.append(path.isEmpty() ? "" : ".").append(step.getPropertyName());
            }
        }
        return path.isEmpty() ? "the body" : path.toString();
    }

    private static boolean isMissingProperty(final MismatchedInputException failure) {
        return String.valueOf(failure.getOriginalMessage()).startsWith(MISSING_PROPERTY);
    }

    private static String expected(final MismatchedInputException failure) {
        final Class<?> target = failure.getTargetType();
        return target == null ? "another type" : target.getSimpleName();
    }

    private record Decoded(
            GitHubWebhookEvent event, @Nullable String fallbackReason) {}

    /** The body as a map, built on first use and once for a delivery. */
    private final class Payload {

        private final JsonNode root;
        private @Nullable Map<String, Object> value;

        private Payload(final JsonNode root) {
            this.root = root;
        }

        private Map<String, Object> get() {
            Map<String, Object> built = value;
            if (built == null) {
                built = mapper.convertValue(root, PAYLOAD);
                value = built;
            }
            return built;
        }
    }
}
