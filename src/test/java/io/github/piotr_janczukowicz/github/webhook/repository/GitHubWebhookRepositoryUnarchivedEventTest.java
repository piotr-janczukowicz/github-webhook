package io.github.piotr_janczukowicz.github.webhook.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryUnarchivedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookRepositoryUnarchivedEventBuilder builder =
                GitHubWebhookRepositoryUnarchivedEventBuilder.builder(
                                RepositoryCatalogFixtures.webhookRepositoryUnarchivedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookRepositoryUnarchivedEventBuilder builder =
                GitHubWebhookRepositoryUnarchivedEventBuilder.builder(
                                RepositoryCatalogFixtures.webhookRepositoryUnarchivedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
