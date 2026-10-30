package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestAutoMergeDisabledPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeDisabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
