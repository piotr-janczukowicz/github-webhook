package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * Comments provide a way for people to collaborate on an issue.
 *
 * @param authorAssociation How the author is associated with the repository.
 * @param body Contents of the issue comment
 * @param bodyHtml body_html
 * @param bodyText body_text
 * @param createdAt created_at
 * @param htmlUrl html_url
 * @param id Unique identifier of the issue comment
 * @param issueUrl issue_url
 * @param minimized minimized
 * @param nodeId node_id
 * @param performedViaGithubApp performed_via_github_app
 * @param pin pin
 * @param reactions reactions
 * @param updatedAt updated_at
 * @param url URL for the issue comment
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/issue-dependencies-blocked-by-added/requestBody/properties/blocked_issue/properties/pinned_comment")
public record GitHubWebhookIssueComment(
        @Nullable GitHubWebhookIssueAuthorAssociation authorAssociation,
        @Nullable String body,
        @Nullable String bodyHtml,
        @Nullable String bodyText,
        Instant createdAt,
        String htmlUrl,
        long id,
        String issueUrl,
        @Nullable GitHubWebhookMinimizedIssueComment minimized,
        String nodeId,
        @Nullable GitHubWebhookGitHubApp performedViaGithubApp,
        @Nullable GitHubWebhookPinnedIssueComment pin,
        @Nullable GitHubWebhookReactions reactions,
        Instant updatedAt,
        String url,
        @Nullable GitHubWebhookSimpleUser user) {
    public GitHubWebhookIssueComment {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(issueUrl, "issueUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
