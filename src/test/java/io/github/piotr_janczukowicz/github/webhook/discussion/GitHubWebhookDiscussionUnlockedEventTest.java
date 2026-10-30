package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionUnlockedEventTest {

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionUnlockedEventBuilder builder = GitHubWebhookDiscussionUnlockedEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionUnlockedEvent())
                .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionUnlockedEventBuilder builder = GitHubWebhookDiscussionUnlockedEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionUnlockedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionUnlockedEventBuilder builder = GitHubWebhookDiscussionUnlockedEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionUnlockedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
