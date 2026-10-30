package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionLabeledEventTest {

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionLabeledEventBuilder builder = GitHubWebhookDiscussionLabeledEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionLabeledEvent())
                .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookDiscussionLabeledEventBuilder builder = GitHubWebhookDiscussionLabeledEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionLabeledEvent())
                .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionLabeledEventBuilder builder = GitHubWebhookDiscussionLabeledEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionLabeledEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionLabeledEventBuilder builder = GitHubWebhookDiscussionLabeledEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionLabeledEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
