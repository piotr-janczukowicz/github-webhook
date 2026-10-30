package io.github.piotr_janczukowicz.github.webhook.repositoryimport;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryImportEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookRepositoryImportEventBuilder builder = GitHubWebhookRepositoryImportEventBuilder.builder(
                        RepositoryImportCatalogFixtures.webhookRepositoryImportEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryImportEventBuilder builder = GitHubWebhookRepositoryImportEventBuilder.builder(
                        RepositoryImportCatalogFixtures.webhookRepositoryImportEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }

    @Test
    void constructor_shouldThrow_whenStatusNull() {
        final GitHubWebhookRepositoryImportEventBuilder builder = GitHubWebhookRepositoryImportEventBuilder.builder(
                        RepositoryImportCatalogFixtures.webhookRepositoryImportEvent())
                .status(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("status");
    }
}
