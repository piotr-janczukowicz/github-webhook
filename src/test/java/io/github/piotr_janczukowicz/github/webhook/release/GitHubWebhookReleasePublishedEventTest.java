package io.github.piotr_janczukowicz.github.webhook.release;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReleasePublishedEventTest {

    @Test
    void constructor_shouldThrow_whenReleaseNull() {
        final GitHubWebhookReleasePublishedEventBuilder builder = GitHubWebhookReleasePublishedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleasePublishedEvent())
                .release(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("release");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookReleasePublishedEventBuilder builder = GitHubWebhookReleasePublishedEventBuilder.builder(
                        ReleaseCatalogFixtures.webhookReleasePublishedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
