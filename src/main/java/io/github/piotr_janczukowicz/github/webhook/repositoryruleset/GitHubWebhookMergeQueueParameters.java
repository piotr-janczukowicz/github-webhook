package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The merge queue parameters payload.
 *
 * @param checkResponseTimeoutMinutes Maximum time for a required status check to report a conclusion. After this much
 *     time has elapsed, checks that have not reported a conclusion will be assumed to have failed
 * @param groupingStrategy When set to ALLGREEN, the merge commit created by merge queue for each PR in the group must
 *     pass all required checks to merge. When set to HEADGREEN, only the commit at the head of the merge group, i.e.
 *     the commit containing changes from all of the PRs in the group, must pass its required checks to merge.
 * @param maxEntriesToBuild Limit the number of queued pull requests requesting checks and workflow runs at the same
 *     time.
 * @param maxEntriesToMerge The maximum number of PRs that will be merged together in a group.
 * @param mergeMethod Method to use when merging changes from queued pull requests.
 * @param minEntriesToMerge The minimum number of PRs that will be merged together in a group.
 * @param minEntriesToMergeWaitMinutes The time merge queue should wait after the first PR is added to the queue for the
 *     minimum group size to be met. After this time has elapsed, the minimum group size will be ignored and a smaller
 *     group will be merged.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/4/properties/parameters")
public record GitHubWebhookMergeQueueParameters(
        long checkResponseTimeoutMinutes,
        GitHubWebhookMergeQueueParametersGroupingStrategy groupingStrategy,
        long maxEntriesToBuild,
        long maxEntriesToMerge,
        GitHubWebhookMergeQueueParametersMergeMethod mergeMethod,
        long minEntriesToMerge,
        long minEntriesToMergeWaitMinutes) {
    public GitHubWebhookMergeQueueParameters {
        requireNonNull(groupingStrategy, "groupingStrategy");
        requireNonNull(mergeMethod, "mergeMethod");
    }
}
