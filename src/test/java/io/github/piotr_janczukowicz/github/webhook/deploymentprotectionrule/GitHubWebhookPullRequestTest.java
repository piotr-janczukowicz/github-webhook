package io.github.piotr_janczukowicz.github.webhook.deploymentprotectionrule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestTest {

    @Test
    void constructor_shouldThrow_whenLinksNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .links(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("links");
    }

    @Test
    void constructor_shouldThrow_whenAuthorAssociationNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .authorAssociation(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorAssociation");
    }

    @Test
    void constructor_shouldThrow_whenBaseNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .base(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("base");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDiffUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .diffUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("diffUrl");
    }

    @Test
    void constructor_shouldThrow_whenHeadNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .head(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("head");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .issueUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .labels(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labels");
    }

    @Test
    void constructor_shouldThrow_whenMergeableStateNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .mergeableState(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeableState");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPatchUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .patchUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("patchUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .reviewCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .reviewCommentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewCommentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenUserNull() {
        final GitHubWebhookPullRequestBuilder builder = GitHubWebhookPullRequestBuilder.builder(
                        DeploymentProtectionRuleCatalogFixtures.webhookPullRequest())
                .user(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("user");
    }
}
