package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleaseDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenReleaseNull() {
        final GitHubWebhookReleaseDeletedEventBuilder builder = GitHubWebhookReleaseDeletedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseDeletedEvent())
                .release(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("release");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookReleaseDeletedEventBuilder builder = GitHubWebhookReleaseDeletedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseDeletedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookReleaseDeletedEventBuilder builder = GitHubWebhookReleaseDeletedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseDeletedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
