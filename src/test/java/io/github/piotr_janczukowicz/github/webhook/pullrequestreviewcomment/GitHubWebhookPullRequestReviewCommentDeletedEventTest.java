package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookPullRequestReviewCommentDeletedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentDeletedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentDeletedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewCommentDeletedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentDeletedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentDeletedEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestReviewCommentDeletedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentDeletedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentDeletedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestReviewCommentDeletedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentDeletedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
