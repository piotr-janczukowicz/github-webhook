package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A issues webhook event with an action this library version does not know.
 *
 * @param action the action GitHub sent, or {@code null} when the body has none
 * @param payload the body as GitHub sent it
 */
public record GitHubWebhookIssuesUnknownActionEvent(
        @Nullable String action, Map<String, Object> payload) implements GitHubWebhookIssuesEvent {
    public GitHubWebhookIssuesUnknownActionEvent {
        requireNonNull(payload, "payload");
    }
}
