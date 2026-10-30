package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewThreadResolvedEventTest {

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewThreadResolvedEventBuilder builder =
                GitHubWebhookPullRequestReviewThreadResolvedEventBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadResolvedEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestReviewThreadResolvedEventBuilder builder =
                GitHubWebhookPullRequestReviewThreadResolvedEventBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadResolvedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenThreadNull() {
        final GitHubWebhookPullRequestReviewThreadResolvedEventBuilder builder =
                GitHubWebhookPullRequestReviewThreadResolvedEventBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadResolvedEvent())
                        .thread(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("thread");
    }
}
