package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesTransferredChangesNewRepositoryTest {

    @Test
    void constructor_shouldThrow_whenArchiveUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .archiveUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("archiveUrl");
    }

    @Test
    void constructor_shouldThrow_whenAssigneesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .assigneesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("assigneesUrl");
    }

    @Test
    void constructor_shouldThrow_whenBlobsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .blobsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobsUrl");
    }

    @Test
    void constructor_shouldThrow_whenBranchesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .branchesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("branchesUrl");
    }

    @Test
    void constructor_shouldThrow_whenCloneUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .cloneUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("cloneUrl");
    }

    @Test
    void constructor_shouldThrow_whenCollaboratorsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .collaboratorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("collaboratorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCompareUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .compareUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("compareUrl");
    }

    @Test
    void constructor_shouldThrow_whenContentsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .contentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenContributorsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .contributorsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contributorsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenDefaultBranchNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .defaultBranch(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("defaultBranch");
    }

    @Test
    void constructor_shouldThrow_whenDeploymentsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .deploymentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("deploymentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenDownloadsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .downloadsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("downloadsUrl");
    }

    @Test
    void constructor_shouldThrow_whenEventsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .eventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("eventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenFullNameNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .fullName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("fullName");
    }

    @Test
    void constructor_shouldThrow_whenGitCommitsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .gitCommitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitCommitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitRefsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .gitRefsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitRefsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitTagsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .gitTagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitTagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .gitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitUrl");
    }

    @Test
    void constructor_shouldThrow_whenHooksUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .hooksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("hooksUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueCommentUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .issueCommentUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueCommentUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssueEventsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .issueEventsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueEventsUrl");
    }

    @Test
    void constructor_shouldThrow_whenIssuesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .issuesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issuesUrl");
    }

    @Test
    void constructor_shouldThrow_whenKeysUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .keysUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("keysUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenLanguagesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .languagesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("languagesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMergesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .mergesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergesUrl");
    }

    @Test
    void constructor_shouldThrow_whenMilestonesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .milestonesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestonesUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenNotificationsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .notificationsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("notificationsUrl");
    }

    @Test
    void constructor_shouldThrow_whenPullsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .pullsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullsUrl");
    }

    @Test
    void constructor_shouldThrow_whenReleasesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .releasesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("releasesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSshUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .sshUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sshUrl");
    }

    @Test
    void constructor_shouldThrow_whenStargazersUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .stargazersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("stargazersUrl");
    }

    @Test
    void constructor_shouldThrow_whenStatusesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .statusesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statusesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscribersUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .subscribersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscribersUrl");
    }

    @Test
    void constructor_shouldThrow_whenSubscriptionUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .subscriptionUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("subscriptionUrl");
    }

    @Test
    void constructor_shouldThrow_whenSvnUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .svnUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("svnUrl");
    }

    @Test
    void constructor_shouldThrow_whenTagsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .tagsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("tagsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTeamsUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .teamsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("teamsUrl");
    }

    @Test
    void constructor_shouldThrow_whenTopicsNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .topics(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("topics");
    }

    @Test
    void constructor_shouldThrow_whenTreesUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .treesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("treesUrl");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenVisibilityNull() {
        final GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder builder =
                GitHubWebhookIssuesTransferredChangesNewRepositoryBuilder.builder(
                                IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository())
                        .visibility(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("visibility");
    }
}
