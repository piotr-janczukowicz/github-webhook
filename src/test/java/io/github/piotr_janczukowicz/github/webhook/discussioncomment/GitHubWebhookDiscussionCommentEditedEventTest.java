package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionCommentEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookDiscussionCommentEditedEventBuilder builder =
                GitHubWebhookDiscussionCommentEditedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookDiscussionCommentEditedEventBuilder builder =
                GitHubWebhookDiscussionCommentEditedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionCommentEditedEventBuilder builder =
                GitHubWebhookDiscussionCommentEditedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedEvent())
                        .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionCommentEditedEventBuilder builder =
                GitHubWebhookDiscussionCommentEditedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionCommentEditedEventBuilder builder =
                GitHubWebhookDiscussionCommentEditedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
