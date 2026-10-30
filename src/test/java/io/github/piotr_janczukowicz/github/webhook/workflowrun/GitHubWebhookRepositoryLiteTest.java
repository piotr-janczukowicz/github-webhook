package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryLiteTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookRepositoryLiteBuilder builder = GitHubWebhookRepositoryLiteBuilder.builder(
                        WorkflowRunCatalogFixtures.webhookRepositoryLite())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
