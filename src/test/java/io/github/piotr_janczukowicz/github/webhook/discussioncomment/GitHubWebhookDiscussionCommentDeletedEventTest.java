package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionCommentDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookDiscussionCommentDeletedEventBuilder builder =
                GitHubWebhookDiscussionCommentDeletedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentDeletedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionCommentDeletedEventBuilder builder =
                GitHubWebhookDiscussionCommentDeletedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentDeletedEvent())
                        .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionCommentDeletedEventBuilder builder =
                GitHubWebhookDiscussionCommentDeletedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentDeletedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionCommentDeletedEventBuilder builder =
                GitHubWebhookDiscussionCommentDeletedEventBuilder.builder(
                                DiscussionCommentCatalogFixtures.webhookDiscussionCommentDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
