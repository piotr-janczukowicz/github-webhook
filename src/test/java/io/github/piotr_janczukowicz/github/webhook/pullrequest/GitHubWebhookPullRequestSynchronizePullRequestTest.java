package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestSynchronizePullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestSynchronizePullRequestBuilder builder =
                GitHubWebhookPullRequestSynchronizePullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
