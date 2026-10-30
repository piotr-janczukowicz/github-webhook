package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestDequeuedPullRequestBaseRepoTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestDequeuedPullRequestBaseRepoBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo())
                        .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
