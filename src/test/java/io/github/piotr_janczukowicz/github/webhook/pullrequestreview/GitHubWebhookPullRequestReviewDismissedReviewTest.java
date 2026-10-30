package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewDismissedReviewTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommitIdNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .commitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitId");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestUrlNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .pullRequestUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequestUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenSubmittedAtNull() {
        final GitHubWebhookPullRequestReviewDismissedReviewBuilder builder =
                GitHubWebhookPullRequestReviewDismissedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview())
                        .submittedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("submittedAt");
    }
}
