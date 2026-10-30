package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunRequestedWorkflowRunTest {

    @Test
    void constructor_shouldThrow_whenArtifactsUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .artifactsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("artifactsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCancelUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .cancelUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cancelUrl");
    }

    @Test
    void constructor_shouldThrow_whenCheckSuiteNodeIdNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .checkSuiteNodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteNodeId");
    }

    @Test
    void constructor_shouldThrow_whenCheckSuiteUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .checkSuiteUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDisplayTitleNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .displayTitle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("displayTitle");
    }

    @Test
    void constructor_shouldThrow_whenEventNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .event(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("event");
    }

    @Test
    void constructor_shouldThrow_whenHeadCommitNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .headCommit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headCommit");
    }

    @Test
    void constructor_shouldThrow_whenHeadRepositoryNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .headRepository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headRepository");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenJobsUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .jobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("jobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLogsUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .logsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("logsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRerunUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .rerunUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rerunUrl");
    }

    @Test
    void constructor_shouldThrow_whenRunStartedAtNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .runStartedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runStartedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowUrlNull() {
        final GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder builder =
                GitHubWebhookWorkflowRunRequestedWorkflowRunBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun())
                        .workflowUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowUrl");
    }
}
