package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The status of auto merging a pull request.
 *
 * @param commitMessage Commit message for the merge commit.
 * @param commitTitle Title for the merge commit message.
 * @param enabledBy A GitHub user.
 * @param mergeMethod The merge method to use.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/auto_merge")
public record GitHubWebhookAutoMerge(
        String commitMessage,
        String commitTitle,
        GitHubWebhookSimpleUser enabledBy,
        GitHubWebhookPullRequestAutoMergeMergeMethod mergeMethod) {
    public GitHubWebhookAutoMerge {
        requireNonNull(commitMessage, "commitMessage");
        requireNonNull(commitTitle, "commitTitle");
        requireNonNull(enabledBy, "enabledBy");
        requireNonNull(mergeMethod, "mergeMethod");
    }
}
