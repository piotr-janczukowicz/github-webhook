package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewApprovedWorkflowJobRunTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedWorkflowJobRun())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEnvironmentNull() {
        final GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedWorkflowJobRun())
                        .environment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("environment");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedWorkflowJobRun())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedWorkflowJobRun())
                        .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder builder =
                GitHubWebhookDeploymentReviewApprovedWorkflowJobRunBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedWorkflowJobRun())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
