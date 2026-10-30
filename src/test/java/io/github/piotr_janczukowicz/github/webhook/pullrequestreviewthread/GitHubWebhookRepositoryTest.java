package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookRepositoryBuilder builder = GitHubWebhookRepositoryBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookRepository())
                .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
