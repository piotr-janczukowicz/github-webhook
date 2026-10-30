package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionCommentCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookDiscussionCommentCreatedEventBuilder builder =
                GitHubWebhookDiscussionCommentCreatedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentCreatedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionCommentCreatedEventBuilder builder =
                GitHubWebhookDiscussionCommentCreatedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentCreatedEvent())
                        .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionCommentCreatedEventBuilder builder =
                GitHubWebhookDiscussionCommentCreatedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentCreatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionCommentCreatedEventBuilder builder =
                GitHubWebhookDiscussionCommentCreatedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
