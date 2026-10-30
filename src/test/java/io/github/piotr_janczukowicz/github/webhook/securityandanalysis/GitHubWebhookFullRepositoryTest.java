package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookFullRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPushedAtNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .pushedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pushedAt");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookFullRepositoryBuilder builder = GitHubWebhookFullRepositoryBuilder.builder(
                        SecurityAndAnalysisCatalogFixtures.webhookFullRepository())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
