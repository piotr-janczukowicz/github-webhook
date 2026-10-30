package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentEditedPullRequestHead())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentEditedPullRequestHead())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentEditedPullRequestHead())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
