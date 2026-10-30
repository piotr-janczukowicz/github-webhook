package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentEditedPullRequestBase())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentEditedPullRequestBase())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentEditedPullRequestBase())
                        .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentEditedPullRequestBase())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
