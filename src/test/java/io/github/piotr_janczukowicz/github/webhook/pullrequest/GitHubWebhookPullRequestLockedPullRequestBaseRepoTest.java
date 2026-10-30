package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLockedPullRequestBaseRepoTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBaseRepo())
                        .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
