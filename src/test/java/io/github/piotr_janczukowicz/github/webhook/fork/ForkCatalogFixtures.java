package io.github.piotr_janczukowicz.github.webhook.fork;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLicense;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryVisibility;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;

final class ForkCatalogFixtures {

    private ForkCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookForkEvent webhookForkEvent() {
        return GitHubWebhookForkEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .forkee(webhookRepository())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepository webhookRepository() {
        return GitHubWebhookRepositoryBuilder.builder()
                .allowAutoMerge(true)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .archiveUrl("archive_url")
                .archived(true)
                .assigneesUrl("assignees_url")
                .blobsUrl("blobs_url")
                .branchesUrl("branches_url")
                .cloneUrl("clone_url")
                .collaboratorsUrl("collaborators_url")
                .commentsUrl("comments_url")
                .commitsUrl("commits_url")
                .compareUrl("compare_url")
                .contentsUrl("contents_url")
                .contributorsUrl("contributors_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("deployments_url")
                .description("description")
                .disabled(true)
                .downloadsUrl("downloads_url")
                .eventsUrl("events_url")
                .fork(true)
                .forks(1L)
                .forksCount(1L)
                .forksUrl("forks_url")
                .fullName("full_name")
                .gitCommitsUrl("git_commits_url")
                .gitRefsUrl("git_refs_url")
                .gitTagsUrl("git_tags_url")
                .gitUrl("git_url")
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasWiki(true)
                .homepage("homepage")
                .hooksUrl("hooks_url")
                .htmlUrl("html_url")
                .id(1L)
                .isTemplate(true)
                .issueCommentUrl("issue_comment_url")
                .issueEventsUrl("issue_events_url")
                .issuesUrl("issues_url")
                .keysUrl("keys_url")
                .labelsUrl("labels_url")
                .language("language")
                .languagesUrl("languages_url")
                .license(webhookLicense())
                .masterBranch("master_branch")
                .mergesUrl("merges_url")
                .milestonesUrl("milestones_url")
                .mirrorUrl("https://api.github.com/mirror_url")
                .name("name")
                .nodeId("node_id")
                .notificationsUrl("notifications_url")
                .openIssues(1L)
                .openIssuesCount(1L)
                .organization("organization")
                .owner(webhookUser())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .publicValue(true)
                .pullsUrl("pulls_url")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("releases_url")
                .roleName("role_name")
                .size(1L)
                .sshUrl("ssh_url")
                .stargazers(1L)
                .stargazersCount(1L)
                .stargazersUrl("stargazers_url")
                .statusesUrl("statuses_url")
                .subscribersUrl("subscribers_url")
                .subscriptionUrl("subscription_url")
                .svnUrl("svn_url")
                .tagsUrl("tags_url")
                .teamsUrl("teams_url")
                .topics(List.of("topics"))
                .treesUrl("trees_url")
                .updatedAt("updated_at")
                .url("url")
                .visibility(GitHubWebhookRepositoryVisibility.PUBLIC)
                .watchers(1L)
                .watchersCount(1L)
                .webCommitSignoffRequired(true)
                .build();
    }

    static GitHubWebhookUser webhookUser() {
        return GitHubWebhookUserBuilder.builder()
                .avatarUrl("https://api.github.com/avatar_url")
                .deleted(true)
                .email("email")
                .eventsUrl("https://api.github.com/events_url{/id}")
                .followersUrl("https://api.github.com/followers_url")
                .followingUrl("https://api.github.com/following_url{/id}")
                .gistsUrl("https://api.github.com/gists_url{/id}")
                .gravatarId("gravatar_id")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .login("login")
                .name("name")
                .nodeId("node_id")
                .organizationsUrl("https://api.github.com/organizations_url")
                .receivedEventsUrl("https://api.github.com/received_events_url")
                .reposUrl("https://api.github.com/repos_url")
                .siteAdmin(true)
                .starredUrl("https://api.github.com/starred_url{/id}")
                .subscriptionsUrl("https://api.github.com/subscriptions_url")
                .type(GitHubWebhookUserType.BOT)
                .url("https://api.github.com/url")
                .userViewType("user_view_type")
                .build();
    }
}
