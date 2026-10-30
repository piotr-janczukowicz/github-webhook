package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The discussion comment edited changes payload.
 *
 * @param body body
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-comment-edited/requestBody/properties/changes")
public record GitHubWebhookDiscussionCommentEditedChanges(GitHubWebhookIssuesEditedChangesBody body) {
    public GitHubWebhookDiscussionCommentEditedChanges {
        requireNonNull(body, "body");
    }
}
