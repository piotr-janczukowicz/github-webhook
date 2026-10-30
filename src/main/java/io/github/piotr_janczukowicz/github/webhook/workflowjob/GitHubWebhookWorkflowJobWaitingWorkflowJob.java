package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The workflow job waiting workflow job payload.
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
 * @param runnerGroupId runner_group_id
 * @param runnerGroupName runner_group_name
 * @param runnerId runner_id
 * @param runnerName runner_name
 * @param startedAt started_at
 * @param status status
 * @param steps steps
 * @param url url
 * @param workflowName The name of the workflow.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/workflow-job-waiting/requestBody/properties/workflow_job")
public record GitHubWebhookWorkflowJobWaitingWorkflowJob(
        String checkRunUrl,
        @Nullable String completedAt,
        @Nullable String conclusion,
        String createdAt,
        @Nullable String headBranch,
        String headSha,
        String htmlUrl,
        long id,
        List<String> labels,
        String name,
        String nodeId,
        long runAttempt,
        double runId,
        String runUrl,
        @Nullable Long runnerGroupId,
        @Nullable String runnerGroupName,
        @Nullable Long runnerId,
        @Nullable String runnerName,
        Instant startedAt,
        GitHubWebhookWorkflowJobStatus status,
        List<GitHubWebhookWorkflowJobWaitingWorkflowJobStep> steps,
        String url,
        @Nullable String workflowName) {
    public GitHubWebhookWorkflowJobWaitingWorkflowJob {
        requireNonNull(checkRunUrl, "checkRunUrl");
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
