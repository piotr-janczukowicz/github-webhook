package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
