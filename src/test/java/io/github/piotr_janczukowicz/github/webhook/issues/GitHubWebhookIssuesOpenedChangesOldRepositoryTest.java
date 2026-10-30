package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesOpenedChangesOldRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder builder =
                GitHubWebhookIssuesOpenedChangesOldRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository())
                        .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
