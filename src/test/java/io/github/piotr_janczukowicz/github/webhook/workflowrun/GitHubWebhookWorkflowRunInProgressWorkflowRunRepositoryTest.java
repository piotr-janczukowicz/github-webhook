package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
