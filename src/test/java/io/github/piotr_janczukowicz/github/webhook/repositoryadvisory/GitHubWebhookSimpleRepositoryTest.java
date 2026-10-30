package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimpleRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookSimpleRepositoryBuilder builder = GitHubWebhookSimpleRepositoryBuilder.builder(
                        RepositoryAdvisoryCatalogFixtures.webhookSimpleRepository())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
