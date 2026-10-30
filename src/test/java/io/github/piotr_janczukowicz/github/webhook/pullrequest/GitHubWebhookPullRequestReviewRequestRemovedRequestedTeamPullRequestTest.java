package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestRemovedRequestedTeamPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
