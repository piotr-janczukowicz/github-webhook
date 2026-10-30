package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewDismissedEventTest {

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewDismissedEventBuilder builder =
                GitHubWebhookPullRequestReviewDismissedEventBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestReviewDismissedEventBuilder builder =
                GitHubWebhookPullRequestReviewDismissedEventBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenReviewNull() {
        final GitHubWebhookPullRequestReviewDismissedEventBuilder builder =
                GitHubWebhookPullRequestReviewDismissedEventBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedEvent())
                        .review(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("review");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestReviewDismissedEventBuilder builder =
                GitHubWebhookPullRequestReviewDismissedEventBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
