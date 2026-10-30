package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestHeadRepo())
                        .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
