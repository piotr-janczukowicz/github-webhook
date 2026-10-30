package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookDeployment;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;
import java.util.List;

final class WorkflowJobCatalogFixtures {

    private WorkflowJobCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookWorkflowJob webhookWorkflowJob() {
        return GitHubWebhookWorkflowJobBuilder.builder()
                .checkRunUrl("check_run_url")
                .completedAt("completed_at")
                .conclusion(GitHubWebhookWorkflowJobConclusion.SUCCESS)
                .createdAt("created_at")
                .headBranch("head_branch")
                .headSha("head_sha")
                .htmlUrl("html_url")
                .id(1L)
                .labels(List.of("labels"))
                .name("name")
                .nodeId("node_id")
                .runAttempt(1L)
                .runId(1L)
                .runUrl("run_url")
                .runnerGroupId(1L)
                .runnerGroupName("runner_group_name")
                .runnerId(1L)
                .runnerName("runner_name")
                .startedAt("started_at")
                .status(GitHubWebhookWorkflowJobStatus.QUEUED)
                .steps(List.of(webhookWorkflowStep()))
                .url("url")
                .workflowName("workflow_name")
                .build();
    }

    static GitHubWebhookWorkflowJobCompletedEvent webhookWorkflowJobCompletedEvent() {
        return GitHubWebhookWorkflowJobCompletedEventBuilder.builder()
                .deployment(webhookDeployment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .workflowJob(webhookWorkflowJob())
                .build();
    }

    static GitHubWebhookWorkflowJobInProgressEvent webhookWorkflowJobInProgressEvent() {
        return GitHubWebhookWorkflowJobInProgressEventBuilder.builder()
                .deployment(webhookDeployment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .workflowJob(webhookWorkflowJobInProgressWorkflowJob())
                .build();
    }

    static GitHubWebhookWorkflowJobInProgressWorkflowJob webhookWorkflowJobInProgressWorkflowJob() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder()
                .checkRunUrl("check_run_url")
                .completedAt("completed_at")
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobConclusion.SUCCESS)
                .createdAt("created_at")
                .headBranch("head_branch")
                .headSha("head_sha")
                .htmlUrl("html_url")
                .id(1L)
                .labels(List.of("labels"))
                .name("name")
                .nodeId("node_id")
                .runAttempt(1L)
                .runId(1L)
                .runUrl("run_url")
                .runnerGroupId(1L)
                .runnerGroupName("runner_group_name")
                .runnerId(1L)
                .runnerName("runner_name")
                .startedAt("started_at")
                .status(GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.IN_PROGRESS)
                .steps(List.of(webhookWorkflowJobInProgressWorkflowJobStep()))
                .url("url")
                .workflowName("workflow_name")
                .build();
    }

    static GitHubWebhookWorkflowJobInProgressWorkflowJobStep webhookWorkflowJobInProgressWorkflowJobStep() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobStepBuilder.builder()
                .completedAt("completed_at")
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt("started_at")
                .status(GitHubWebhookWorkflowJobInProgressWorkflowJobStepStatus.IN_PROGRESS)
                .build();
    }

    static GitHubWebhookWorkflowJobQueuedEvent webhookWorkflowJobQueuedEvent() {
        return GitHubWebhookWorkflowJobQueuedEventBuilder.builder()
                .deployment(webhookDeployment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .workflowJob(webhookWorkflowJobQueuedWorkflowJob())
                .build();
    }

    static GitHubWebhookWorkflowJobQueuedWorkflowJob webhookWorkflowJobQueuedWorkflowJob() {
        return GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder()
                .checkRunUrl("https://api.github.com/check_run_url")
                .completedAt("completed_at")
                .conclusion("conclusion")
                .createdAt("created_at")
                .headBranch("head_branch")
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labels(List.of("labels"))
                .name("name")
                .nodeId("node_id")
                .runAttempt(1L)
                .runId(1.5)
                .runUrl("https://api.github.com/run_url")
                .runnerGroupId(1L)
                .runnerGroupName("runner_group_name")
                .runnerId(1L)
                .runnerName("runner_name")
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookWorkflowJobStatus.QUEUED)
                .steps(List.of(webhookWorkflowJobQueuedWorkflowJobStep()))
                .url("https://api.github.com/url")
                .workflowName("workflow_name")
                .build();
    }

    static GitHubWebhookWorkflowJobQueuedWorkflowJobStep webhookWorkflowJobQueuedWorkflowJobStep() {
        return GitHubWebhookWorkflowJobQueuedWorkflowJobStepBuilder.builder()
                .completedAt("completed_at")
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt("started_at")
                .status(GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus.COMPLETED)
                .build();
    }

    static GitHubWebhookWorkflowJobWaitingEvent webhookWorkflowJobWaitingEvent() {
        return GitHubWebhookWorkflowJobWaitingEventBuilder.builder()
                .deployment(webhookDeployment())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .workflowJob(webhookWorkflowJobWaitingWorkflowJob())
                .build();
    }

    static GitHubWebhookWorkflowJobWaitingWorkflowJob webhookWorkflowJobWaitingWorkflowJob() {
        return GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder()
                .checkRunUrl("https://api.github.com/check_run_url")
                .completedAt("completed_at")
                .conclusion("conclusion")
                .createdAt("created_at")
                .headBranch("head_branch")
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labels(List.of("labels"))
                .name("name")
                .nodeId("node_id")
                .runAttempt(1L)
                .runId(1.5)
                .runUrl("https://api.github.com/run_url")
                .runnerGroupId(1L)
                .runnerGroupName("runner_group_name")
                .runnerId(1L)
                .runnerName("runner_name")
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookWorkflowJobStatus.QUEUED)
                .steps(List.of(webhookWorkflowJobWaitingWorkflowJobStep()))
                .url("https://api.github.com/url")
                .workflowName("workflow_name")
                .build();
    }

    static GitHubWebhookWorkflowJobWaitingWorkflowJobStep webhookWorkflowJobWaitingWorkflowJobStep() {
        return GitHubWebhookWorkflowJobWaitingWorkflowJobStepBuilder.builder()
                .completedAt("completed_at")
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt("started_at")
                .status(GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.COMPLETED)
                .build();
    }

    static GitHubWebhookWorkflowStep webhookWorkflowStep() {
        return GitHubWebhookWorkflowStepBuilder.builder()
                .completedAt("completed_at")
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt("started_at")
                .status(GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.IN_PROGRESS)
                .build();
    }
}
