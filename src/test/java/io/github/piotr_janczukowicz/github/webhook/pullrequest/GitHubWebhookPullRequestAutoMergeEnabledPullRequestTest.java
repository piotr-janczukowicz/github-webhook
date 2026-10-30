package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestAutoMergeEnabledPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder builder =
                GitHubWebhookPullRequestAutoMergeEnabledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
