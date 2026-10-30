package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestStackedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestStackedPullRequestBuilder builder =
                GitHubWebhookPullRequestStackedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
