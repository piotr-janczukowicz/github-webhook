package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMinimalRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookMinimalRepositoryBuilder builder = GitHubWebhookMinimalRepositoryBuilder.builder(
                        CheckRunCatalogFixtures.webhookMinimalRepository())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
