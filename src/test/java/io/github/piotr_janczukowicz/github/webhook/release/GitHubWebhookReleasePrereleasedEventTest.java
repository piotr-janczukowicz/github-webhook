package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleasePrereleasedEventTest {

    @Test
    void constructor_shouldThrow_whenReleaseNull() {
        final GitHubWebhookReleasePrereleasedEventBuilder builder = GitHubWebhookReleasePrereleasedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleasePrereleasedEvent())
                .release(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("release");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookReleasePrereleasedEventBuilder builder = GitHubWebhookReleasePrereleasedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleasePrereleasedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
