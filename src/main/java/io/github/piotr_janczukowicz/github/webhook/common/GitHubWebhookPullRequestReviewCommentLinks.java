package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The pull request review comment links payload.
 *
 * @param html html
 * @param pullRequest pull_request
 * @param self self
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-comment-created/requestBody/properties/comment/properties/_links")
public record GitHubWebhookPullRequestReviewCommentLinks(
        GitHubWebhookLink html, GitHubWebhookLink pullRequest, GitHubWebhookLink self) {
    public GitHubWebhookPullRequestReviewCommentLinks {
        requireNonNull(html, "html");
        requireNonNull(pullRequest, "pullRequest");
        requireNonNull(self, "self");
    }
}
