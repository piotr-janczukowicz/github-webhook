package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookForkRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookForkRepositoryBuilder builder = GitHubWebhookForkRepositoryBuilder.builder(
                        CommonCatalogFixtures.webhookForkRepository())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
