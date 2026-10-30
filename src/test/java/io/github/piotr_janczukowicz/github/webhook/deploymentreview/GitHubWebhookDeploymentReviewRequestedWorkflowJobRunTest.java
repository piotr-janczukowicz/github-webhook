package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewRequestedWorkflowJobRunTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedWorkflowJobRun())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEnvironmentNull() {
        final GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedWorkflowJobRun())
                        .environment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("environment");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedWorkflowJobRun())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedWorkflowJobRun())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewRequestedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedWorkflowJobRun())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
