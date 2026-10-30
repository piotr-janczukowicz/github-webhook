package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestAssignedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestAssignedPullRequestBuilder builder =
                GitHubWebhookPullRequestAssignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
