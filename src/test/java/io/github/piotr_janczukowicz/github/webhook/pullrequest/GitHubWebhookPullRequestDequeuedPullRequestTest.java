package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestDequeuedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
