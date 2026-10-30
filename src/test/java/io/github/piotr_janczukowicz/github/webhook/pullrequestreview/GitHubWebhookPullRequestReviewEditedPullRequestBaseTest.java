package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewEditedPullRequestBaseTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBase())
                        .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRefNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBase())
                        .ref(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ref");
    }

    @Test
    void constructor_shouldThrow_whenRepoNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBase())
                        .repo(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repo");
    }

    @Test
    void constructor_shouldThrow_whenShaNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBase())
                        .sha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sha");
    }
}
