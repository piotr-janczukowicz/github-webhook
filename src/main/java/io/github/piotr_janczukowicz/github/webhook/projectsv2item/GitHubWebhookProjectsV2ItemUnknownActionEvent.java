package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A projects v2 item webhook event with an action this library version does not know.
 *
 * @param action the action GitHub sent, or {@code null} when the body has none
 * @param payload the body as GitHub sent it
 */
public record GitHubWebhookProjectsV2ItemUnknownActionEvent(
        @Nullable String action, Map<String, Object> payload) implements GitHubWebhookProjectsV2ItemEvent {
    public GitHubWebhookProjectsV2ItemUnknownActionEvent {
        requireNonNull(payload, "payload");
    }
}
