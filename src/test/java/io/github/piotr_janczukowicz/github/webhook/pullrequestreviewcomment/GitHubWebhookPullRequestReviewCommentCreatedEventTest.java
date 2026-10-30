package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedEventBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedEventBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
