package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewSubmittedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewSubmittedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
