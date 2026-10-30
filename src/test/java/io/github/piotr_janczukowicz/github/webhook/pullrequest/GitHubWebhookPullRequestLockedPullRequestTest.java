package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLockedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
