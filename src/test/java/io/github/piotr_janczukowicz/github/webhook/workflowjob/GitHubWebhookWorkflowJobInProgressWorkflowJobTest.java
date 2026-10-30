package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowJobInProgressWorkflowJobTest {

    @Test
    void constructor_shouldThrow_whenCheckRunUrlNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .checkRunUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRunUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHeadShaNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .headSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("headSha");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRunUrlNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .runUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("runUrl");
    }

    @Test
    void constructor_shouldThrow_whenStartedAtNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .startedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("startedAt");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenStepsNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .steps(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("steps");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder builder =
                GitHubWebhookWorkflowJobInProgressWorkflowJobBuilder.builder(
                                WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
