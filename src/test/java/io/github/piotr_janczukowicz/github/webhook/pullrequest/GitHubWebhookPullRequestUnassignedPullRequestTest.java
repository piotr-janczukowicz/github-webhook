package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestUnassignedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestUnassignedPullRequestBuilder builder =
                GitHubWebhookPullRequestUnassignedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
