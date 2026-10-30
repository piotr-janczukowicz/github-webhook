package io.github.piotr_janczukowicz.github.webhook.deploykey;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeployKeyCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenKeyNull() {
        final GitHubWebhookDeployKeyCreatedEventBuilder builder = GitHubWebhookDeployKeyCreatedEventBuilder.builder(
                        DeployKeyCatalogFixtures.webhookDeployKeyCreatedEvent())
                .key(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("key");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDeployKeyCreatedEventBuilder builder = GitHubWebhookDeployKeyCreatedEventBuilder.builder(
                        DeployKeyCatalogFixtures.webhookDeployKeyCreatedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDeployKeyCreatedEventBuilder builder = GitHubWebhookDeployKeyCreatedEventBuilder.builder(
                        DeployKeyCatalogFixtures.webhookDeployKeyCreatedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
