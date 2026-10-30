package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckSuiteCompletedCheckSuiteConclusion;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDeploymentWorkflowRunReferencedWorkflow;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleCommit;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The workflow run requested workflow run payload.
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
@CatalogSchema("webhooks/workflow-run-requested/requestBody/properties/workflow_run")
public record GitHubWebhookWorkflowRunRequestedWorkflowRun(
        @Nullable GitHubWebhookUser actor,
        String artifactsUrl,
        String cancelUrl,
        long checkSuiteId,
        String checkSuiteNodeId,
        String checkSuiteUrl,
        @Nullable GitHubWebhookCheckSuiteCompletedCheckSuiteConclusion conclusion,
        Instant createdAt,
        String displayTitle,
        String event,
        @Nullable String headBranch,
        GitHubWebhookSimpleCommit headCommit,
        GitHubWebhookRepositoryLite headRepository,
        String headSha,
        String htmlUrl,
        long id,
        String jobsUrl,
        String logsUrl,
        @Nullable String name,
        String nodeId,
        String path,
        @Nullable String previousAttemptUrl,
        List<GitHubWebhookWorkflowRunPullRequest> pullRequests,
        @Nullable List<GitHubWebhookDeploymentWorkflowRunReferencedWorkflow> referencedWorkflows,
        GitHubWebhookRepositoryLite repository,
        String rerunUrl,
        long runAttempt,
        long runNumber,
        Instant runStartedAt,
        GitHubWebhookWorkflowRunStatus status,
        @Nullable GitHubWebhookUser triggeringActor,
        Instant updatedAt,
        String url,
        long workflowId,
        String workflowUrl) {
    public GitHubWebhookWorkflowRunRequestedWorkflowRun {
        requireNonNull(artifactsUrl, "artifactsUrl");
        requireNonNull(cancelUrl, "cancelUrl");
        requireNonNull(checkSuiteNodeId, "checkSuiteNodeId");
        requireNonNull(checkSuiteUrl, "checkSuiteUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(displayTitle, "displayTitle");
        requireNonNull(event, "event");
        requireNonNull(headCommit, "headCommit");
        requireNonNull(headRepository, "headRepository");
        requireNonNull(headSha, "headSha");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(jobsUrl, "jobsUrl");
        requireNonNull(logsUrl, "logsUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(path, "path");
        requireNonNull(pullRequests, "pullRequests");
        requireNonNull(repository, "repository");
        requireNonNull(rerunUrl, "rerunUrl");
        requireNonNull(runStartedAt, "runStartedAt");
        requireNonNull(status, "status");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
        requireNonNull(workflowUrl, "workflowUrl");
    }
}
