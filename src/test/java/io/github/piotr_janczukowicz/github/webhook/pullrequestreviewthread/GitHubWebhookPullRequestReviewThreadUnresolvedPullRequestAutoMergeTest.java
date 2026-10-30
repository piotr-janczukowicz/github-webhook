package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeTest {

    @Test
    void constructor_shouldThrow_whenCommitTitleNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequestAutoMerge())
                        .commitTitle(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitTitle");
    }

    @Test
    void constructor_shouldThrow_whenMergeMethodNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequestAutoMerge())
                        .mergeMethod(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeMethod");
    }
}
