package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewThreadResolvedThreadTest {

    @Test
    void constructor_shouldThrow_whenCommentsNull() {
        final GitHubWebhookPullRequestReviewThreadResolvedThreadBuilder builder =
                GitHubWebhookPullRequestReviewThreadResolvedThreadBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadResolvedThread())
                        .comments(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comments");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewThreadResolvedThreadBuilder builder =
                GitHubWebhookPullRequestReviewThreadResolvedThreadBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadResolvedThread())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }
}
