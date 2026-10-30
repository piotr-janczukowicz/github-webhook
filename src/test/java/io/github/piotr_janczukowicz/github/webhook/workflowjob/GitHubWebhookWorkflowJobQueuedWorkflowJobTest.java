package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobQueuedWorkflowJobTest {

    @Test
    void constructor_shouldThrow_whenCheckRunUrlNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .checkRunUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRunUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRunUrlNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .runUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runUrl");
    }

    @Test
    void constructor_shouldThrow_whenStartedAtNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .startedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("startedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenStepsNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .steps(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("steps");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobQueuedWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
