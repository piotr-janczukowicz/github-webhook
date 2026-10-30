package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The pull request review comment edited pull request base payload.
 *
 * @param label label
 * @param ref ref
 * @param repo A git repository
 * @param sha sha
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-comment-created/requestBody/properties/pull_request/properties/base")
public record GitHubWebhookPullRequestReviewCommentEditedPullRequestBase(
        String label,
        String ref,
        GitHubWebhookRepository repo,
        String sha,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookPullRequestReviewCommentEditedPullRequestBase {
        requireNonNull(label, "label");
        requireNonNull(ref, "ref");
        requireNonNull(repo, "repo");
        requireNonNull(sha, "sha");
    }
}
