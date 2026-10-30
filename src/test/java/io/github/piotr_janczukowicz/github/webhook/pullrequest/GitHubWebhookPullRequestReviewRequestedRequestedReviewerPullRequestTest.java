package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestBuilder.builder(
                                PullRequestCatalogFixtures
                                        .webhookPullRequestReviewRequestedRequestedReviewerPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
