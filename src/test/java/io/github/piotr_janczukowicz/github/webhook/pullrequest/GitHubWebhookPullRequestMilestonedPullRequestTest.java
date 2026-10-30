package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestMilestonedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestMilestonedPullRequestBuilder builder =
                GitHubWebhookPullRequestMilestonedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
