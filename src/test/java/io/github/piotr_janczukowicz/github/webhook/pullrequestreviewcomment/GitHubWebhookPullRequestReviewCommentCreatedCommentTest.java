package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentCreatedCommentTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCommitIdNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .commitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitId");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffHunkNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .diffHunk(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffHunk");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOriginalCommitIdNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .originalCommitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("originalCommitId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .pullRequestUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequestUrl");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenSideNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .side(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("side");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
