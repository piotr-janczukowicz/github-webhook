package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobTest {

    @Test
    void constructor_shouldThrow_whenCheckRunUrlNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .checkRunUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRunUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompletedAtNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .completedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("completedAt");
    }

    @Test
    void constructor_shouldThrow_whenConclusionNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .conclusion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("conclusion");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRunUrlNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .runUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runUrl");
    }

    @Test
    void constructor_shouldThrow_whenStartedAtNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .startedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("startedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenStepsNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .steps(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("steps");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowJobBuilder builder = GitHubWebhookWorkflowJobBuilder.builder(
                        WorkflowJobCatalogFixtures.webhookWorkflowJob())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
