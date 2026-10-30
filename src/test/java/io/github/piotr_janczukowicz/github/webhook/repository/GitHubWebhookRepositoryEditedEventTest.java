package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookRepositoryEditedEventBuilder builder = GitHubWebhookRepositoryEditedEventBuilder.builder(
                        RepositoryCatalogFixtures.webhookRepositoryEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookRepositoryEditedEventBuilder builder = GitHubWebhookRepositoryEditedEventBuilder.builder(
                        RepositoryCatalogFixtures.webhookRepositoryEditedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryEditedEventBuilder builder = GitHubWebhookRepositoryEditedEventBuilder.builder(
                        RepositoryCatalogFixtures.webhookRepositoryEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
