package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewEditedPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
