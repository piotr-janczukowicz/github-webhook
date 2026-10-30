package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A dependabot alert webhook event with an action this library version does not know.
 *
 * @param action the action GitHub sent, or {@code null} when the body has none
 * @param payload the body as GitHub sent it
 */
public record GitHubWebhookDependabotAlertUnknownActionEvent(
        @Nullable String action, Map<String, Object> payload) implements GitHubWebhookDependabotAlertEvent {
    public GitHubWebhookDependabotAlertUnknownActionEvent {
        requireNonNull(payload, "payload");
    }
}
