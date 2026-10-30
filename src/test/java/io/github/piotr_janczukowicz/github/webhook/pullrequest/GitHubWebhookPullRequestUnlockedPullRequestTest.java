package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestUnlockedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestUnlockedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlockedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
