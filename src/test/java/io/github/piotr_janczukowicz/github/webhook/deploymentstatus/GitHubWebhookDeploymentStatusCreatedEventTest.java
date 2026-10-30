package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentStatusCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenDeploymentNull() {
        final GitHubWebhookDeploymentStatusCreatedEventBuilder builder =
                GitHubWebhookDeploymentStatusCreatedEventBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedEvent())
                        .deployment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deployment");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentStatusNull() {
        final GitHubWebhookDeploymentStatusCreatedEventBuilder builder =
                GitHubWebhookDeploymentStatusCreatedEventBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedEvent())
                        .deploymentStatus(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentStatus");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDeploymentStatusCreatedEventBuilder builder =
                GitHubWebhookDeploymentStatusCreatedEventBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDeploymentStatusCreatedEventBuilder builder =
                GitHubWebhookDeploymentStatusCreatedEventBuilder.builder(
                                DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
