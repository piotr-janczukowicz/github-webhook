package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenCheckRunNull() {
        final GitHubWebhookCheckRunCreatedEventBuilder builder = GitHubWebhookCheckRunCreatedEventBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRunCreatedEvent())
                .checkRun(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRun");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCheckRunCreatedEventBuilder builder = GitHubWebhookCheckRunCreatedEventBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRunCreatedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCheckRunCreatedEventBuilder builder = GitHubWebhookCheckRunCreatedEventBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRunCreatedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
