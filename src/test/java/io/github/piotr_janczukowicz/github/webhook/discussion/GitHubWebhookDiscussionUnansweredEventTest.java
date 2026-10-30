package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionUnansweredEventTest {

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionUnansweredEventBuilder builder =
                GitHubWebhookDiscussionUnansweredEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionUnansweredEvent())
                        .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenOldAnswerNull() {
        final GitHubWebhookDiscussionUnansweredEventBuilder builder =
                GitHubWebhookDiscussionUnansweredEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionUnansweredEvent())
                        .oldAnswer(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("oldAnswer");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionUnansweredEventBuilder builder =
                GitHubWebhookDiscussionUnansweredEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionUnansweredEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
