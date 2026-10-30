package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckRunPullRequest;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunReferencedWorkflow;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunStatus;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The deployment workflow run payload.
 *
 * @param actor actor
 * @param artifactsUrl artifacts_url
 * @param cancelUrl cancel_url
 * @param checkSuiteId check_suite_id
 * @param checkSuiteNodeId check_suite_node_id
 * @param checkSuiteUrl check_suite_url
 * @param conclusion conclusion
 * @param createdAt created_at
 * @param displayTitle display_title
 * @param event event
 * @param headBranch head_branch
 * @param headCommit head_commit
 * @param headRepository head_repository
 * @param headSha head_sha
 * @param htmlUrl html_url
 * @param id id
 * @param jobsUrl jobs_url
 * @param logsUrl logs_url
 * @param name name
 * @param nodeId node_id
 * @param path path
 * @param previousAttemptUrl previous_attempt_url
 * @param pullRequests pull_requests
 * @param referencedWorkflows referenced_workflows
 * @param repository repository
 * @param rerunUrl rerun_url
 * @param runAttempt run_attempt
 * @param runNumber run_number
 * @param runStartedAt run_started_at
 * @param status status
 * @param triggeringActor triggering_actor
 * @param updatedAt updated_at
 * @param url url
 * @param workflowId workflow_id
 * @param workflowUrl workflow_url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-review-approved/requestBody/properties/workflow_run")
public record GitHubWebhookDeploymentWorkflowRun(
        @Nullable GitHubWebhookUser actor,
        @Nullable String artifactsUrl,
        @Nullable String cancelUrl,
        long checkSuiteId,
        String checkSuiteNodeId,
        @Nullable String checkSuiteUrl,
        @Nullable GitHubWebhookDeploymentWorkflowRunConclusion conclusion,
        Instant createdAt,
        String displayTitle,
        String event,
        String headBranch,

        @Nullable @SuppressSchemaTypeMismatch("free-form object: the dump gives no value type")
        Map<String, Object> headCommit,

        @Nullable GitHubWebhookDeploymentWorkflowRunHeadRepository headRepository,
        String headSha,
        String htmlUrl,
        long id,
        @Nullable String jobsUrl,
        @Nullable String logsUrl,
        String name,
        String nodeId,
        String path,
        @Nullable String previousAttemptUrl,
        List<GitHubWebhookCheckRunPullRequest> pullRequests,
        @Nullable List<GitHubWebhookDeploymentWorkflowRunReferencedWorkflow> referencedWorkflows,
        @Nullable GitHubWebhookDeploymentWorkflowRunHeadRepository repository,
        @Nullable String rerunUrl,
        long runAttempt,
        long runNumber,
        Instant runStartedAt,
        GitHubWebhookDeploymentWorkflowRunStatus status,
        @Nullable GitHubWebhookUser triggeringActor,
        Instant updatedAt,
        String url,
        long workflowId,
        @Nullable String workflowUrl) {
    public GitHubWebhookDeploymentWorkflowRun {
        requireNonNull(checkSuiteNodeId, "checkSuiteNodeId");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(displayTitle, "displayTitle");
        requireNonNull(event, "event");
        requireNonNull(headBranch, "headBranch");
        requireNonNull(headSha, "headSha");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(path, "path");
        requireNonNull(pullRequests, "pullRequests");
        requireNonNull(runStartedAt, "runStartedAt");
        requireNonNull(status, "status");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
