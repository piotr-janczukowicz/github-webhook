package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewApprovedEventTest {

    @Test
    void constructor_shouldThrow_whenOrganizationNull() {
        final GitHubWebhookDeploymentReviewApprovedEventBuilder builder =
                GitHubWebhookDeploymentReviewApprovedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedEvent())
                        .organization(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("organization");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDeploymentReviewApprovedEventBuilder builder =
                GitHubWebhookDeploymentReviewApprovedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDeploymentReviewApprovedEventBuilder builder =
                GitHubWebhookDeploymentReviewApprovedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenSinceNull() {
        final GitHubWebhookDeploymentReviewApprovedEventBuilder builder =
                GitHubWebhookDeploymentReviewApprovedEventBuilder.builder(
                                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedEvent())
                        .since(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("since");
    }
}
