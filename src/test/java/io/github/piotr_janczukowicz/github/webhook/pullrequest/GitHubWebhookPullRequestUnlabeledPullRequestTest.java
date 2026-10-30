package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestUnlabeledPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .assignees(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assignees");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenRequestedReviewersNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .requestedReviewers(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedReviewers");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamsNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .requestedTeams(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeams");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestUnlabeledPullRequestBuilder builder =
                GitHubWebhookPullRequestUnlabeledPullRequestBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
