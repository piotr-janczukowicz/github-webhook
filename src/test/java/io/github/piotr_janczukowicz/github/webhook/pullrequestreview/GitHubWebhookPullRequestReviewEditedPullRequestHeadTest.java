package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewEditedPullRequestHeadTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestHeadBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestHead())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestHeadBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestHead())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestHeadBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestHeadBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestHead())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
