package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder builder =
                GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryBuilder.builder(
                                WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
