package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewEditedReviewTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewEditedReviewBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewEditedReviewBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenCommitIdNull() {
        final GitHubWebhookPullRequestReviewEditedReviewBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview())
                        .commitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitId");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewEditedReviewBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewEditedReviewBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestUrlNull() {
        final GitHubWebhookPullRequestReviewEditedReviewBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview())
                        .pullRequestUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequestUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewEditedReviewBuilder builder =
                GitHubWebhookPullRequestReviewEditedReviewBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }
}
