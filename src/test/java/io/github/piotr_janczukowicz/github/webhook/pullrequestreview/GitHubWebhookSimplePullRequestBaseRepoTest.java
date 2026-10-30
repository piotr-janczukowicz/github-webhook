package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestBaseRepoTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookSimplePullRequestBaseRepoBuilder builder =
                GitHubWebhookSimplePullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo())
                        .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
