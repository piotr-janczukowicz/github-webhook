package io.github.piotr_janczukowicz.github.webhook.githubappauthorization;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A github app authorization webhook event with an action this library version does not know.
 *
 * @param action the action GitHub sent, or {@code null} when the body has none
 * @param payload the body as GitHub sent it
 */
public record GitHubWebhookGithubAppAuthorizationUnknownActionEvent(
        @Nullable String action, Map<String, Object> payload) implements GitHubWebhookGithubAppAuthorizationEvent {
    public GitHubWebhookGithubAppAuthorizationUnknownActionEvent {
        requireNonNull(payload, "payload");
    }
}
