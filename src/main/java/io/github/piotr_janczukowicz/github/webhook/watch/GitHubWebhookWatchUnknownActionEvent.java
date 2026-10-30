package io.github.piotr_janczukowicz.github.webhook.watch;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A watch webhook event with an action this library version does not know.
 *
 * @param action the action GitHub sent, or {@code null} when the body has none
 * @param payload the body as GitHub sent it
 */
public record GitHubWebhookWatchUnknownActionEvent(@Nullable String action, Map<String, Object> payload)
        implements GitHubWebhookWatchEvent {
    public GitHubWebhookWatchUnknownActionEvent {
        requireNonNull(payload, "payload");
    }
}
