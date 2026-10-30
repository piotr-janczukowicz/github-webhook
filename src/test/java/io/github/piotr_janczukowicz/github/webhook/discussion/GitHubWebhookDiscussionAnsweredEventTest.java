package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionAnsweredEventTest {

    @Test
    void constructor_shouldThrow_whenAnswerNull() {
        final GitHubWebhookDiscussionAnsweredEventBuilder builder = GitHubWebhookDiscussionAnsweredEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionAnsweredEvent())
                .answer(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("answer");
    }

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionAnsweredEventBuilder builder = GitHubWebhookDiscussionAnsweredEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionAnsweredEvent())
                .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionAnsweredEventBuilder builder = GitHubWebhookDiscussionAnsweredEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionAnsweredEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionAnsweredEventBuilder builder = GitHubWebhookDiscussionAnsweredEventBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussionAnsweredEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
