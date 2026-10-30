package io.github.piotr_janczukowicz.github.webhook.delete;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeleteEventTest {

    @Test
    void constructor_shouldThrow_whenPusherTypeNull() {
        final GitHubWebhookDeleteEventBuilder builder = GitHubWebhookDeleteEventBuilder.builder(
                        DeleteCatalogFixtures.webhookDeleteEvent())
                .pusherType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pusherType");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookDeleteEventBuilder builder = GitHubWebhookDeleteEventBuilder.builder(
                        DeleteCatalogFixtures.webhookDeleteEvent())
                .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRefTypeNull() {
        final GitHubWebhookDeleteEventBuilder builder = GitHubWebhookDeleteEventBuilder.builder(
                        DeleteCatalogFixtures.webhookDeleteEvent())
                .refType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("refType");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDeleteEventBuilder builder = GitHubWebhookDeleteEventBuilder.builder(
                        DeleteCatalogFixtures.webhookDeleteEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDeleteEventBuilder builder = GitHubWebhookDeleteEventBuilder.builder(
                        DeleteCatalogFixtures.webhookDeleteEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
