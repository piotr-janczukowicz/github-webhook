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
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookWorkflowJobConclusion.SUCCESS)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
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
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
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
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobConclusion.SUCCESS)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
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
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.IN_PROGRESS)
                .steps(List.of(webhookWorkflowJobInProgressWorkflowJobStep()))
                .url("url")
                .workflowName("workflow_name")
                .build();
    }

    static GitHubWebhookWorkflowJobInProgressWorkflowJobStep webhookWorkflowJobInProgressWorkflowJobStep() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobStepBuilder.builder()
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
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
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion("conclusion")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .headBranch("head_branch")
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labels(List.of("labels"))
                .name("name")
                .nodeId("node_id")
                .runAttempt(1L)
                .runId(1L)
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
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
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
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion("conclusion")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .headBranch("head_branch")
                .headSha("head_sha")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labels(List.of("labels"))
                .name("name")
                .nodeId("node_id")
                .runAttempt(1L)
                .runId(1L)
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
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.COMPLETED)
                .build();
    }

    static GitHubWebhookWorkflowStep webhookWorkflowStep() {
        return GitHubWebhookWorkflowStepBuilder.builder()
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .conclusion(GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.FAILURE)
                .name("name")
                .number(1L)
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .status(GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.IN_PROGRESS)
                .build();
    }
}
