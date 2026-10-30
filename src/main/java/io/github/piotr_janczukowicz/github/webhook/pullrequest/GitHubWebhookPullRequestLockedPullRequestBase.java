package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The pull request locked pull request base payload.
 *
 * @param label label
 * @param ref ref
 * @param repo A git repository
 * @param sha sha
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-assigned/requestBody/properties/pull_request/properties/base")
public record GitHubWebhookPullRequestLockedPullRequestBase(
        String label,
        String ref,
        GitHubWebhookPullRequestLockedPullRequestBaseRepo repo,
        String sha,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookPullRequestLockedPullRequestBase {
        requireNonNull(label, "label");
        requireNonNull(ref, "ref");
        requireNonNull(repo, "repo");
        requireNonNull(sha, "sha");
    }
}
