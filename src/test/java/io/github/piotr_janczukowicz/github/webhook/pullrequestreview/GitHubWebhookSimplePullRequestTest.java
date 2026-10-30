package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookSimplePullRequestBuilder builder = GitHubWebhookSimplePullRequestBuilder.builder(
                        PullRequestReviewCatalogFixtures.webhookSimplePullRequest())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
