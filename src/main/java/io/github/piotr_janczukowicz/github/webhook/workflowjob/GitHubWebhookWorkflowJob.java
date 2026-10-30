package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The workflow job payload.
 *
 * @param checkRunUrl check_run_url
 * @param completedAt completed_at
 * @param conclusion conclusion
 * @param createdAt The time that the job created.
 * @param headBranch The name of the current branch.
 * @param headSha head_sha
 * @param htmlUrl html_url
 * @param id id
 * @param labels labels
 * @param name name
 * @param nodeId node_id
 * @param runAttempt run_attempt
 * @param runId run_id
 * @param runUrl run_url
 * @param runnerGroupId The ID of the runner group that is running this job. This will be {@code null} as long as
 *     {@code workflow_job[status]} is {@code queued}.
 * @param runnerGroupName runner_group_name
 * @param runnerId The ID of the runner that is running this job. This will be {@code null} as long as
 *     {@code workflow_job[status]} is {@code queued}.
 * @param runnerName runner_name
 * @param startedAt started_at
 * @param status The current status of the job. Can be {@code queued}, {@code in_progress}, {@code waiting}, or
 *     {@code completed}.
 * @param steps steps
 * @param url url
 * @param workflowName The name of the workflow.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/workflow-job-completed/requestBody/properties/workflow_job")
public record GitHubWebhookWorkflowJob(
        String checkRunUrl,
        String completedAt,
        GitHubWebhookWorkflowJobConclusion conclusion,
        String createdAt,
        @Nullable String headBranch,
        String headSha,
        String htmlUrl,
        long id,
        List<String> labels,
        String name,
        String nodeId,
        long runAttempt,
        long runId,
        String runUrl,
        @Nullable Long runnerGroupId,
        @Nullable String runnerGroupName,
        @Nullable Long runnerId,
        @Nullable String runnerName,
        String startedAt,
        GitHubWebhookWorkflowJobStatus status,
        List<GitHubWebhookWorkflowStep> steps,
        String url,
        @Nullable String workflowName) {
    public GitHubWebhookWorkflowJob {
        requireNonNull(checkRunUrl, "checkRunUrl");
        requireNonNull(completedAt, "completedAt");
        requireNonNull(conclusion, "conclusion");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(headSha, "headSha");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(labels, "labels");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(runUrl, "runUrl");
        requireNonNull(startedAt, "startedAt");
        requireNonNull(status, "status");
        requireNonNull(steps, "steps");
        requireNonNull(url, "url");
    }
}
