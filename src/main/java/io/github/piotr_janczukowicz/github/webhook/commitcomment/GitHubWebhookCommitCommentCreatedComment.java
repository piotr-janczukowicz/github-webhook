package io.github.piotr_janczukowicz.github.webhook.commitcomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookReactions;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The [commit
 * comment](${externalDocsUpapp/api/description/components/schemas/webhooks/issue-comment-created.yamlrl}/rest/commits/comments#get-a-commit-comment)
 * resource.
 *
 * @param authorAssociation How the author is associated with the repository.
 * @param body The text of the comment.
 * @param commitId The SHA of the commit to which the comment applies.
 * @param createdAt created_at
 * @param htmlUrl html_url
 * @param id The ID of the commit comment.
 * @param line The line of the blob to which the comment applies. The last line of the range for a multi-line comment
 * @param nodeId The node ID of the commit comment.
 * @param path The relative path of the file to which the comment applies.
 * @param position The line index in the diff to which the comment applies.
 * @param reactions reactions
 * @param updatedAt updated_at
 * @param url url
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/commit-comment-created/requestBody/properties/comment")
public record GitHubWebhookCommitCommentCreatedComment(
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        String body,
        String commitId,
        String createdAt,
        String htmlUrl,
        long id,
        @Nullable Long line,
        String nodeId,
        @Nullable String path,
        @Nullable Long position,
        @Nullable GitHubWebhookReactions reactions,
        String updatedAt,
        String url,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookCommitCommentCreatedComment {
        requireNonNull(authorAssociation, "authorAssociation");
        requireNonNull(body, "body");
        requireNonNull(commitId, "commitId");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
