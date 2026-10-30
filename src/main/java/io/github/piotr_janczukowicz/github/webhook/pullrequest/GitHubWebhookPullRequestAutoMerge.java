package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPullRequestAutoMergeMergeMethod;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The status of auto merging a pull request.
 *
 * @param commitMessage Commit message for the merge commit.
 * @param commitTitle Title for the merge commit message.
 * @param enabledBy enabled_by
 * @param mergeMethod The merge method to use.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-assigned/requestBody/properties/pull_request/properties/auto_merge")
public record GitHubWebhookPullRequestAutoMerge(
        @Nullable String commitMessage,
        @Nullable String commitTitle,
        @Nullable GitHubWebhookUser enabledBy,
        GitHubWebhookPullRequestAutoMergeMergeMethod mergeMethod) {
    public GitHubWebhookPullRequestAutoMerge {
        requireNonNull(mergeMethod, "mergeMethod");
    }
}
