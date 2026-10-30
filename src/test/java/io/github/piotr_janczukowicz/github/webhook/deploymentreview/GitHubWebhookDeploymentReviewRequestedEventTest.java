package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewRequestedEventTest {

    @Test
    void constructor_shouldThrow_whenEnvironmentNull() {
        final GitHubWebhookDeploymentReviewRequestedEventBuilder builder =
                GitHubWebhookDeploymentReviewRequestedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent())
                        .environment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("environment");
    }

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookDeploymentReviewRequestedEventBuilder builder =
                GitHubWebhookDeploymentReviewRequestedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDeploymentReviewRequestedEventBuilder builder =
                GitHubWebhookDeploymentReviewRequestedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenReviewersNull() {
        final GitHubWebhookDeploymentReviewRequestedEventBuilder builder =
                GitHubWebhookDeploymentReviewRequestedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent())
                        .reviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewers");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDeploymentReviewRequestedEventBuilder builder =
                GitHubWebhookDeploymentReviewRequestedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSinceNull() {
        final GitHubWebhookDeploymentReviewRequestedEventBuilder builder =
                GitHubWebhookDeploymentReviewRequestedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent())
                        .since(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("since");
    }

    @Test
    void constructor_shouldThrow_whenWorkflowJobRunNull() {
        final GitHubWebhookDeploymentReviewRequestedEventBuilder builder =
                GitHubWebhookDeploymentReviewRequestedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent())
                        .workflowJobRun(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("workflowJobRun");
    }
}
