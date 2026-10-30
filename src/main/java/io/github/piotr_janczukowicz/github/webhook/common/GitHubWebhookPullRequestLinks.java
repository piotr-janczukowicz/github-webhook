package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The pull request links payload.
 *
 * @param comments comments
 * @param commits commits
 * @param html html
 * @param issue issue
 * @param reviewComment review_comment
 * @param reviewComments review_comments
 * @param self self
 * @param statuses statuses
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/_links")
public record GitHubWebhookPullRequestLinks(
        GitHubWebhookLink comments,
        GitHubWebhookLink commits,
        GitHubWebhookLink html,
        GitHubWebhookLink issue,
        GitHubWebhookLink reviewComment,
        GitHubWebhookLink reviewComments,
        GitHubWebhookLink self,
        GitHubWebhookLink statuses) {
    public GitHubWebhookPullRequestLinks {
        requireNonNull(comments, "comments");
        requireNonNull(commits, "commits");
        requireNonNull(html, "html");
        requireNonNull(issue, "issue");
        requireNonNull(reviewComment, "reviewComment");
        requireNonNull(reviewComments, "reviewComments");
        requireNonNull(self, "self");
        requireNonNull(statuses, "statuses");
    }
}
