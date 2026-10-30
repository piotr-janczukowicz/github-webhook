package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentCreatedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
