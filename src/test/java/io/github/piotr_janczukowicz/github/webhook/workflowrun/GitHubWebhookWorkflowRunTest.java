package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunTest {

    @Test
    void constructor_shouldThrow_whenArtifactsUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .artifactsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("artifactsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCancelUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .cancelUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cancelUrl");
    }

    @Test
    void constructor_shouldThrow_whenCheckSuiteNodeIdNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .checkSuiteNodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteNodeId");
    }

    @Test
    void constructor_shouldThrow_whenCheckSuiteUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .checkSuiteUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkSuiteUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .event(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("event");
    }

    @Test
    void constructor_shouldThrow_whenHeadCommitNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .headCommit(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headCommit");
    }

    @Test
    void constructor_shouldThrow_whenHeadRepositoryNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .headRepository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headRepository");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenJobsUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .jobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("jobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLogsUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .logsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("logsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestsNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .pullRequests(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequests");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRerunUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .rerunUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rerunUrl");
    }

    @Test
    void constructor_shouldThrow_whenRunStartedAtNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .runStartedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runStartedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowUrlNull() {
        final GitHubWebhookWorkflowRunBuilder builder = GitHubWebhookWorkflowRunBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookWorkflowRun())
                .workflowUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowUrl");
    }
}
