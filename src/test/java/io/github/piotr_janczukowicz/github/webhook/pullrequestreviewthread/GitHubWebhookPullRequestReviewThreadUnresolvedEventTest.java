package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewThreadUnresolvedEventTest {

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedEventBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedEventBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedEventBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedEventBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenThreadNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedEventBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedEventBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedEvent())
                        .thread(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("thread");
    }
}
