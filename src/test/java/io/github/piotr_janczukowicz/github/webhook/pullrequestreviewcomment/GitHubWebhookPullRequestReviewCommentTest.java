package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCommitIdNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .commitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitId");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffHunkNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .diffHunk(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffHunk");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOriginalCommitIdNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .originalCommitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("originalCommitId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestUrlNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .pullRequestUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequestUrl");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenSideNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .side(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("side");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewCommentBuilder builder =
                GitHubWebhookPullRequestReviewCommentBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewComment())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
