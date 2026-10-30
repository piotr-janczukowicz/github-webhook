package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionUnlabeledEventTest {

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionUnlabeledEventBuilder builder =
                GitHubWebhookDiscussionUnlabeledEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionUnlabeledEvent())
                        .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookDiscussionUnlabeledEventBuilder builder =
                GitHubWebhookDiscussionUnlabeledEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionUnlabeledEvent())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionUnlabeledEventBuilder builder =
                GitHubWebhookDiscussionUnlabeledEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionUnlabeledEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionUnlabeledEventBuilder builder =
                GitHubWebhookDiscussionUnlabeledEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionUnlabeledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
