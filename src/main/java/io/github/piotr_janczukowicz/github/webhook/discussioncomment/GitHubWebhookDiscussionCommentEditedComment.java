package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookReactions;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The discussion comment edited comment payload.
 *
 * @param authorAssociation How the author is associated with the repository.
 * @param body body
 * @param childCommentCount child_comment_count
 * @param createdAt created_at
 * @param discussionId discussion_id
 * @param htmlUrl html_url
 * @param id id
 * @param nodeId node_id
 * @param parentId parent_id
 * @param reactions reactions
 * @param repositoryUrl repository_url
 * @param updatedAt updated_at
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-comment-created/requestBody/properties/comment")
public record GitHubWebhookDiscussionCommentEditedComment(
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        String body,
        long childCommentCount,
        String createdAt,
        long discussionId,
        String htmlUrl,
        long id,
        String nodeId,
        @Nullable Long parentId,
        GitHubWebhookReactions reactions,
        String repositoryUrl,
        String updatedAt,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookDiscussionCommentEditedComment {
        requireNonNull(authorAssociation, "authorAssociation");
        requireNonNull(body, "body");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(reactions, "reactions");
        requireNonNull(repositoryUrl, "repositoryUrl");
        requireNonNull(updatedAt, "updatedAt");
    }
}
