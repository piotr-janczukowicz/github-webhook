package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCommitIdNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .commitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitId");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffHunkNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .diffHunk(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffHunk");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOriginalCommitIdNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .originalCommitId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("originalCommitId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .pullRequestUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequestUrl");
    }

    @Test
    void constructor_shouldThrow_whenReactionsNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .reactions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reactions");
    }

    @Test
    void constructor_shouldThrow_whenSideNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .side(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("side");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedThreadComment())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
