package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The check run pull request payload.
 *
 * @param base base
 * @param head head
 * @param id id
 * @param number number
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/pull_requests/items")
public record GitHubWebhookCheckRunPullRequest(
        GitHubWebhookCheckRunPullRequestBase base,
        GitHubWebhookCheckRunPullRequestBase head,
        long id,
        long number,
        String url) {
    public GitHubWebhookCheckRunPullRequest {
        requireNonNull(base, "base");
        requireNonNull(head, "head");
        requireNonNull(url, "url");
    }
}
