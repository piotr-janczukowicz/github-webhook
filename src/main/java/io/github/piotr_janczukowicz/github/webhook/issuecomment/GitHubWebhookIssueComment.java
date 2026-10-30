package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookGitHubApp;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMinimizedIssueComment;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPinnedIssueComment;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookReactions;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The [comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment) itself.
 *
 * @param authorAssociation How the author is associated with the repository.
 * @param body Contents of the issue comment
 * @param createdAt created_at
 * @param htmlUrl html_url
 * @param id Unique identifier of the issue comment
 * @param issueUrl issue_url
 * @param minimized minimized
 * @param nodeId node_id
 * @param performedViaGithubApp GitHub apps are a new way to extend GitHub. They can be installed directly on
 *     organizations and user accounts and granted access to specific repositories. They come with granular permissions
 *     and built-in webhooks. GitHub apps are first class actors within GitHub.
 * @param pin pin
 * @param reactions reactions
 * @param updatedAt updated_at
 * @param url URL for the issue comment
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-deleted/requestBody/properties/comment")
public record GitHubWebhookIssueComment(
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        String body,
        Instant createdAt,
        String htmlUrl,
        long id,
        String issueUrl,
        @Nullable GitHubWebhookMinimizedIssueComment minimized,
        String nodeId,
        @Nullable GitHubWebhookGitHubApp performedViaGithubApp,
        @Nullable GitHubWebhookPinnedIssueComment pin,
        GitHubWebhookReactions reactions,
        Instant updatedAt,
        String url,
        @Nullable GitHubWebhookIssueAssignee user) {
    public GitHubWebhookIssueComment {
        requireNonNull(authorAssociation, "authorAssociation");
        requireNonNull(body, "body");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(issueUrl, "issueUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(reactions, "reactions");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
