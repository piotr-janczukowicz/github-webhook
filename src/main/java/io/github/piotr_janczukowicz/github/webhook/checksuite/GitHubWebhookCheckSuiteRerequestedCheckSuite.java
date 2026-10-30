package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckRunPullRequest;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleCommit;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).
 *
 * @param after after
 * @param app GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user
 *     accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks.
 *     GitHub apps are first class actors within GitHub.
 * @param before before
 * @param checkRunsUrl check_runs_url
 * @param conclusion The summary conclusion for all check runs that are part of the check suite. This value will be
 *     {@code null} until the check run has completed.
 * @param createdAt created_at
 * @param headBranch The head branch name the changes are on.
 * @param headCommit head_commit
 * @param headSha The SHA of the head commit that is being checked.
 * @param id id
 * @param latestCheckRunsCount latest_check_runs_count
 * @param nodeId node_id
 * @param pullRequests An array of pull requests that match this check suite. A pull request matches a check suite if
 *     they have the same {@code head_sha} and {@code head_branch}. When the check suite's {@code head_branch} is in a
 *     forked repository it will be {@code null} and the {@code pull_requests} array will be empty.
 * @param rerequestable rerequestable
 * @param runsRerequestable runs_rerequestable
 * @param status The summary status for all check runs that are part of the check suite. Can be {@code requested},
 *     {@code in_progress}, or {@code completed}.
 * @param updatedAt updated_at
 * @param url URL that points to the check suite API resource.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-suite-rerequested/requestBody/properties/check_suite")
public record GitHubWebhookCheckSuiteRerequestedCheckSuite(
        @Nullable String after,
        GitHubWebhookCheckSuiteRerequestedCheckSuiteApp app,
        @Nullable String before,
        String checkRunsUrl,
        @Nullable GitHubWebhookDeploymentWorkflowRunConclusion conclusion,
        Instant createdAt,
        @Nullable String headBranch,
        GitHubWebhookSimpleCommit headCommit,
        String headSha,
        long id,
        long latestCheckRunsCount,
        String nodeId,
        List<GitHubWebhookCheckRunPullRequest> pullRequests,
        @Nullable Boolean rerequestable,
        @Nullable Boolean runsRerequestable,
        @Nullable GitHubWebhookCheckSuiteRequestedCheckSuiteStatus status,
        Instant updatedAt,
        String url) {
    public GitHubWebhookCheckSuiteRerequestedCheckSuite {
        requireNonNull(app, "app");
        requireNonNull(checkRunsUrl, "checkRunsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(headCommit, "headCommit");
        requireNonNull(headSha, "headSha");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(pullRequests, "pullRequests");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
