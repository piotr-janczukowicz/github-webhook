package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleaseEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookReleaseEditedEventBuilder builder = GitHubWebhookReleaseEditedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenReleaseNull() {
        final GitHubWebhookReleaseEditedEventBuilder builder = GitHubWebhookReleaseEditedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseEditedEvent())
                .release(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("release");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookReleaseEditedEventBuilder builder = GitHubWebhookReleaseEditedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleaseEditedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
