package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewThreadUnresolvedThreadTest {

    @Test
    void constructor_shouldThrow_whenCommentsNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedThread())
                        .comments(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comments");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedThread())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
