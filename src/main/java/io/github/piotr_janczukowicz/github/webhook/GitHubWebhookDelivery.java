package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A decoded webhook delivery together with its body as GitHub sent it. The typed event is one-way: it drops fields this
 * library version does not know, keeps no raw value of an unknown enum constant and does not carry the {@code action}
 * as a property. Keep the delivery, not the event, to queue or forward what was received.
 *
 * @param eventName value of the {@code X-GitHub-Event} header, or {@code null} when there was none
 * @param event the typed event, or an unknown event
 * @param payload the body as a map, with every field, enum value and the {@code action} untouched
 * @param fallbackReason why a known event was kept as an unknown one (the failing property and why, never the body), or
 *     {@code null} when the event decoded as its own record; a genuinely new event or action has none
 */
public record GitHubWebhookDelivery(
        @Nullable String eventName,
        GitHubWebhookEvent event,
        Map<String, Object> payload,
        @Nullable String fallbackReason) {

    public GitHubWebhookDelivery {
        requireNonNull(event, "event");
        requireNonNull(payload, "payload");
    }

    /**
     * Creates a delivery whose event decoded as its own record.
     *
     * @param eventName value of the {@code X-GitHub-Event} header, or {@code null} when there was none
     * @param event the typed event, or an unknown event
     * @param payload the body as a map
     */
    public GitHubWebhookDelivery(
            final @Nullable String eventName, final GitHubWebhookEvent event, final Map<String, Object> payload) {
        this(eventName, event, payload, null);
    }
}
