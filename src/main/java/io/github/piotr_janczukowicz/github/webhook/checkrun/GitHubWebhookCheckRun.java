package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckRunPullRequest;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookGitHubApp;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A check performed on the code of a given code change
 *
 * @param app GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user
 *     accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks.
 *     GitHub apps are first class actors within GitHub.
 * @param checkSuite A suite of checks performed on the code of a given code change
 * @param completedAt completed_at
 * @param conclusion conclusion
 * @param deployment A deployment created as the result of an Actions check run from a workflow that references an
 *     environment
 * @param detailsUrl details_url
 * @param externalId external_id
 * @param headSha The SHA of the commit that is being checked.
 * @param htmlUrl html_url
 * @param id The id of the check.
 * @param name The name of the check.
 * @param nodeId node_id
 * @param output output
 * @param pullRequests pull_requests
 * @param startedAt started_at
 * @param status The phase of the lifecycle that the check is currently in.
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run")
public record GitHubWebhookCheckRun(
        @Nullable GitHubWebhookGitHubApp app,
        GitHubWebhookCheckRunCheckSuite checkSuite,
        @Nullable Instant completedAt,
        @Nullable GitHubWebhookCheckRunConclusion conclusion,
        @Nullable GitHubWebhookDeployment deployment,
        String detailsUrl,
        String externalId,
        String headSha,
        String htmlUrl,
        long id,
        String name,
        String nodeId,
        GitHubWebhookCheckRunOutput output,
        List<GitHubWebhookCheckRunPullRequest> pullRequests,
        Instant startedAt,
        GitHubWebhookCheckRunStatus status,
        String url) {
    public GitHubWebhookCheckRun {
        requireNonNull(checkSuite, "checkSuite");
        requireNonNull(detailsUrl, "detailsUrl");
        requireNonNull(externalId, "externalId");
        requireNonNull(headSha, "headSha");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(output, "output");
        requireNonNull(pullRequests, "pullRequests");
        requireNonNull(startedAt, "startedAt");
        requireNonNull(status, "status");
        requireNonNull(url, "url");
    }
}
