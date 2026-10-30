package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The simple pull request head payload.
 *
 * @param label label
 * @param ref ref
 * @param repo A git repository
 * @param sha sha
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-thread-resolved/requestBody/properties/pull_request/properties/head")
public record GitHubWebhookSimplePullRequestHead(
        @Nullable String label,
        String ref,
        @Nullable GitHubWebhookRepository repo,
        String sha,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookSimplePullRequestHead {
        requireNonNull(ref, "ref");
        requireNonNull(sha, "sha");
    }
}
