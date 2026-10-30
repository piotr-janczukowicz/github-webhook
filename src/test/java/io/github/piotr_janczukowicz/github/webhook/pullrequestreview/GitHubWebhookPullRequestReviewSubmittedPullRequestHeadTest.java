package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewSubmittedPullRequestHeadTest {

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestHeadBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequestHead())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestHeadBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequestHead())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
