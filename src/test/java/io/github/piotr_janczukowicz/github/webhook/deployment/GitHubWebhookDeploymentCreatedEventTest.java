package io.github.piotr_janczukowicz.github.webhook.deployment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenDeploymentNull() {
        final GitHubWebhookDeploymentCreatedEventBuilder builder = GitHubWebhookDeploymentCreatedEventBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentCreatedEvent())
                .deployment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deployment");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDeploymentCreatedEventBuilder builder = GitHubWebhookDeploymentCreatedEventBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentCreatedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDeploymentCreatedEventBuilder builder = GitHubWebhookDeploymentCreatedEventBuilder.builder(
                        DeploymentCatalogFixtures.webhookDeploymentCreatedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
