package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLabeledPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestLabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestLabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
