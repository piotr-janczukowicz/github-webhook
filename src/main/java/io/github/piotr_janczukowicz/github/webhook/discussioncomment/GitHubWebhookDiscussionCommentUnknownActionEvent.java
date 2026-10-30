package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A discussion comment webhook event with an action this library version does not know.
 *
 * @param action the action GitHub sent, or {@code null} when the body has none
 * @param payload the body as GitHub sent it
 */
public record GitHubWebhookDiscussionCommentUnknownActionEvent(
        @Nullable String action, Map<String, Object> payload) implements GitHubWebhookDiscussionCommentEvent {
    public GitHubWebhookDiscussionCommentUnknownActionEvent {
        requireNonNull(payload, "payload");
    }
}
