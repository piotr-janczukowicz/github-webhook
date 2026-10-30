package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunInProgressWorkflowRunTest {

    @Test
    void constructor_shouldThrow_whenArtifactsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .artifactsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("artifactsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCancelUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .cancelUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cancelUrl");
    }

    @Test
    void constructor_shouldThrow_whenCheckSuiteNodeIdNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .checkSuiteNodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteNodeId");
    }

    @Test
    void constructor_shouldThrow_whenCheckSuiteUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .checkSuiteUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .event(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("event");
    }

    @Test
    void constructor_shouldThrow_whenHeadCommitNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .headCommit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headCommit");
    }

    @Test
    void constructor_shouldThrow_whenHeadRepositoryNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .headRepository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headRepository");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenJobsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .jobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("jobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLogsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .logsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("logsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRerunUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .rerunUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rerunUrl");
    }

    @Test
    void constructor_shouldThrow_whenRunStartedAtNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .runStartedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runStartedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun())
                        .workflowUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowUrl");
    }
}
