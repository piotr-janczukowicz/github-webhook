package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobWaitingWorkflowJobTest {

    @Test
    void constructor_shouldThrow_whenCheckRunUrlNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .checkRunUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRunUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRunUrlNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .runUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runUrl");
    }

    @Test
    void constructor_shouldThrow_whenStartedAtNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .startedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("startedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenStepsNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .steps(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("steps");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobWaitingWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingWorkflowJob())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
