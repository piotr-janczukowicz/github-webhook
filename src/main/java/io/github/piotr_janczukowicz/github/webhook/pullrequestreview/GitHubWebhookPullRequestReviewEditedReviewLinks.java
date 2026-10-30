package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookLink;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The pull request review edited review links payload.
 *
 * @param html html
 * @param pullRequest pull_request
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-dismissed/requestBody/properties/review/properties/_links")
public record GitHubWebhookPullRequestReviewEditedReviewLinks(GitHubWebhookLink html, GitHubWebhookLink pullRequest) {
    public GitHubWebhookPullRequestReviewEditedReviewLinks {
        requireNonNull(html, "html");
        requireNonNull(pullRequest, "pullRequest");
    }
}
