package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewRejectedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookDeploymentReviewRejectedEventBuilder builder =
                GitHubWebhookDeploymentReviewRejectedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDeploymentReviewRejectedEventBuilder builder =
                GitHubWebhookDeploymentReviewRejectedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDeploymentReviewRejectedEventBuilder builder =
                GitHubWebhookDeploymentReviewRejectedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSinceNull() {
        final GitHubWebhookDeploymentReviewRejectedEventBuilder builder =
                GitHubWebhookDeploymentReviewRejectedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedEvent())
                        .since(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("since");
    }
}
