package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCheckRunCompletedEventTest {

    @Test
    void constructor_shouldThrow_whenCheckRunNull() {
        final GitHubWebhookCheckRunCompletedEventBuilder builder = GitHubWebhookCheckRunCompletedEventBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRunCompletedEvent())
                .checkRun(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("checkRun");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCheckRunCompletedEventBuilder builder = GitHubWebhookCheckRunCompletedEventBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRunCompletedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCheckRunCompletedEventBuilder builder = GitHubWebhookCheckRunCompletedEventBuilder.builder(
                        CheckRunCatalogFixtures.webhookCheckRunCompletedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
