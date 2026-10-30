package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryRenamedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookRepositoryRenamedEventBuilder builder = GitHubWebhookRepositoryRenamedEventBuilder.builder(
                        RepositoryCatalogFixtures.webhookRepositoryRenamedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookRepositoryRenamedEventBuilder builder = GitHubWebhookRepositoryRenamedEventBuilder.builder(
                        RepositoryCatalogFixtures.webhookRepositoryRenamedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryRenamedEventBuilder builder = GitHubWebhookRepositoryRenamedEventBuilder.builder(
                        RepositoryCatalogFixtures.webhookRepositoryRenamedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
