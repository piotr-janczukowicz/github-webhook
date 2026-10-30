package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures
                                        .webhookPullRequestReviewThreadUnresolvedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
