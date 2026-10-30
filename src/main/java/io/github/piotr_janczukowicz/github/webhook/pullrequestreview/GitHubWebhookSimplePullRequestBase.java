package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The simple pull request base payload.
 *
 * @param label label
 * @param ref ref
 * @param repo A git repository
 * @param sha sha
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-dismissed/requestBody/properties/pull_request/properties/base")
public record GitHubWebhookSimplePullRequestBase(
        String label,
        String ref,
        GitHubWebhookSimplePullRequestBaseRepo repo,
        String sha,
        @Nullable GitHubWebhookPullRequestAutoMergeEnabledBy user) {
    public GitHubWebhookSimplePullRequestBase {
        requireNonNull(label, "label");
        requireNonNull(ref, "ref");
        requireNonNull(repo, "repo");
        requireNonNull(sha, "sha");
    }
}
