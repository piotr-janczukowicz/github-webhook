package io.github.piotr_janczukowicz.github.webhook;

import java.io.Serial;
import org.jspecify.annotations.Nullable;

/**
 * A webhook body that cannot be decoded: it is empty, too large, not a JSON object, or over a JSON limit such as the
 * nesting depth. A body that does not fit the record of a known event is not an error: it is kept as an unknown event.
 * The message names the event and the action and never contains the body.
 */
public final class GitHubWebhookDecodeException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private final @Nullable String eventName;
    private final @Nullable String action;

    /**
     * Creates the exception.
     *
     * @param eventName value of the {@code X-GitHub-Event} header, or {@code null}
     * @param action the action of the body, or {@code null}
     * @param reason what is wrong with the body, without the body
     * @param cause the underlying failure, or {@code null}
     */
    GitHubWebhookDecodeException(
            final @Nullable String eventName,
            final @Nullable String action,
            final String reason,
            final @Nullable Throwable cause) {
        super(
                "Cannot decode webhook event '" + PrintableText.ofNullable(eventName) + "' (action '"
                        + PrintableText.ofNullable(action) + "'): " + reason,
                cause);
        this.eventName = eventName;
        this.action = action;
    }

    /**
     * The event of the delivery.
     *
     * @return value of the {@code X-GitHub-Event} header, or {@code null} when there was none
     */
    public @Nullable String eventName() {
        return eventName;
    }

    /**
     * The action of the delivery.
     *
     * @return the action, or {@code null} when the body has none or it was not read
     */
    public @Nullable String action() {
        return action;
    }
}
