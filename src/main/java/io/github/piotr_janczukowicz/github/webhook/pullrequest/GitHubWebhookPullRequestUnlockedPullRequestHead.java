package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The pull request unlocked pull request head payload.
 *
 * @param label label
 * @param ref ref
 * @param repo A git repository
 * @param sha sha
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-unlocked/requestBody/properties/pull_request/properties/head")
public record GitHubWebhookPullRequestUnlockedPullRequestHead(
        String label,
        String ref,
        @Nullable GitHubWebhookPullRequestLockedPullRequestBaseRepo repo,
        String sha,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookPullRequestUnlockedPullRequestHead {
        requireNonNull(label, "label");
        requireNonNull(ref, "ref");
        requireNonNull(sha, "sha");
    }
}
