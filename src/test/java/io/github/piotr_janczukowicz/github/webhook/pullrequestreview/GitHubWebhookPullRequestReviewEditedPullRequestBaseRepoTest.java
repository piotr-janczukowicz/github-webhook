package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder builder =
                GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo())
                        .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
