package io.github.piotr_janczukowicz.github.webhook.team;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookLicense;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryPermissions;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookRepositoryVisibility;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamNotificationSetting;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamPrivacy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;
import java.util.Map;

final class TeamCatalogFixtures {

    private TeamCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookRepository webhookRepository() {
        return GitHubWebhookRepositoryBuilder.builder()
                .allowAutoMerge(true)
                .allowForking(true)
                .allowMergeCommit(true)
                .allowRebaseMerge(true)
                .allowSquashMerge(true)
                .allowUpdateBranch(true)
                .archiveUrl("https://api.github.com/archive_url{/id}")
                .archived(true)
                .assigneesUrl("https://api.github.com/assignees_url{/id}")
                .blobsUrl("https://api.github.com/blobs_url{/id}")
                .branchesUrl("https://api.github.com/branches_url{/id}")
                .cloneUrl("https://api.github.com/clone_url")
                .collaboratorsUrl("https://api.github.com/collaborators_url{/id}")
                .commentsUrl("https://api.github.com/comments_url{/id}")
                .commitsUrl("https://api.github.com/commits_url{/id}")
                .compareUrl("https://api.github.com/compare_url{/id}")
                .contentsUrl("https://api.github.com/contents_url{/id}")
                .contributorsUrl("https://api.github.com/contributors_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .customProperties(Map.of("key", Map.of()))
                .defaultBranch("default_branch")
                .deleteBranchOnMerge(true)
                .deploymentsUrl("https://api.github.com/deployments_url")
                .description("description")
                .disabled(true)
                .downloadsUrl("https://api.github.com/downloads_url")
                .eventsUrl("https://api.github.com/events_url")
                .fork(true)
                .forks(1L)
                .forksCount(1L)
                .forksUrl("https://api.github.com/forks_url")
                .fullName("full_name")
                .gitCommitsUrl("https://api.github.com/git_commits_url{/id}")
                .gitRefsUrl("https://api.github.com/git_refs_url{/id}")
                .gitTagsUrl("https://api.github.com/git_tags_url{/id}")
                .gitUrl("https://api.github.com/git_url")
                .hasDownloads(true)
                .hasIssues(true)
                .hasPages(true)
                .hasProjects(true)
                .hasWiki(true)
                .homepage("homepage")
                .hooksUrl("https://api.github.com/hooks_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .isTemplate(true)
                .issueCommentUrl("https://api.github.com/issue_comment_url{/id}")
                .issueEventsUrl("https://api.github.com/issue_events_url{/id}")
                .issuesUrl("https://api.github.com/issues_url{/id}")
                .keysUrl("https://api.github.com/keys_url{/id}")
                .labelsUrl("https://api.github.com/labels_url{/id}")
                .language("language")
                .languagesUrl("https://api.github.com/languages_url")
                .license(webhookLicense())
                .masterBranch("master_branch")
                .mergesUrl("https://api.github.com/merges_url")
                .milestonesUrl("https://api.github.com/milestones_url{/id}")
                .mirrorUrl("https://api.github.com/mirror_url")
                .name("name")
                .nodeId("node_id")
                .notificationsUrl("https://api.github.com/notifications_url{/id}")
                .openIssues(1L)
                .openIssuesCount(1L)
                .organization("organization")
                .owner(webhookUser())
                .permissions(webhookRepositoryPermissions())
                .privateValue(true)
                .publicValue(true)
                .pullsUrl("https://api.github.com/pulls_url{/id}")
                .pushedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .releasesUrl("https://api.github.com/releases_url{/id}")
                .roleName("role_name")
                .size(1L)
                .sshUrl("ssh_url")
                .stargazers(1L)
                .stargazersCount(1L)
                .stargazersUrl("https://api.github.com/stargazers_url")
                .statusesUrl("https://api.github.com/statuses_url{/id}")
                .subscribersUrl("https://api.github.com/subscribers_url")
                .subscriptionUrl("https://api.github.com/subscription_url")
                .svnUrl("https://api.github.com/svn_url")
                .tagsUrl("https://api.github.com/tags_url")
                .teamsUrl("https://api.github.com/teams_url")
                .topics(List.of("topics"))
                .treesUrl("https://api.github.com/trees_url{/id}")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .visibility(GitHubWebhookRepositoryVisibility.PUBLIC)
                .watchers(1L)
                .watchersCount(1L)
                .build();
    }

    static GitHubWebhookTeam webhookTeam() {
        return GitHubWebhookTeamBuilder.builder()
                .deleted(true)
                .description("description")
                .enterpriseId(42L)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .membersUrl("https://api.github.com/members_url{/id}")
                .name("name")
                .nodeId("node_id")
                .notificationSetting(GitHubWebhookTeamNotificationSetting.NOTIFICATIONS_ENABLED)
                .organizationId(37L)
                .parent(webhookTeamParent())
                .permission("permission")
                .privacy(GitHubWebhookTeamPrivacy.OPEN)
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .type(GitHubWebhookTeamType.ENTERPRISE)
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookTeamAddedToRepositoryEvent webhookTeamAddedToRepositoryEvent() {
        return GitHubWebhookTeamAddedToRepositoryEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookRepository())
                .sender(webhookSimpleUser())
                .team(webhookTeam())
                .build();
    }

    static GitHubWebhookTeamCreatedEvent webhookTeamCreatedEvent() {
        return GitHubWebhookTeamCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookRepository())
                .sender(webhookSimpleUser())
                .team(webhookTeam())
                .build();
    }

    static GitHubWebhookTeamDeletedEvent webhookTeamDeletedEvent() {
        return GitHubWebhookTeamDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookRepository())
                .sender(webhookSimpleUser())
                .team(webhookTeam())
                .build();
    }

    static GitHubWebhookTeamEditedChanges webhookTeamEditedChanges() {
        return GitHubWebhookTeamEditedChangesBuilder.builder()
                .description(webhookIssuesEditedChangesBody())
                .name(webhookIssuesEditedChangesBody())
                .notificationSetting(webhookIssuesEditedChangesBody())
                .privacy(webhookIssuesEditedChangesBody())
                .repository(webhookTeamEditedChangesRepository())
                .build();
    }

    static GitHubWebhookTeamEditedChangesRepository webhookTeamEditedChangesRepository() {
        return GitHubWebhookTeamEditedChangesRepositoryBuilder.builder()
                .permissions(webhookTeamEditedChangesRepositoryPermissions())
                .build();
    }

    static GitHubWebhookTeamEditedChangesRepositoryPermissions webhookTeamEditedChangesRepositoryPermissions() {
        return GitHubWebhookTeamEditedChangesRepositoryPermissionsBuilder.builder()
                .from(webhookTeamEditedChangesRepositoryPermissionsFrom())
                .build();
    }

    static GitHubWebhookTeamEditedChangesRepositoryPermissionsFrom webhookTeamEditedChangesRepositoryPermissionsFrom() {
        return GitHubWebhookTeamEditedChangesRepositoryPermissionsFromBuilder.builder()
                .admin(true)
                .pull(true)
                .push(true)
                .build();
    }

    static GitHubWebhookTeamEditedEvent webhookTeamEditedEvent() {
        return GitHubWebhookTeamEditedEventBuilder.builder()
                .changes(webhookTeamEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookRepository())
                .sender(webhookSimpleUser())
                .team(webhookTeam())
                .build();
    }

    static GitHubWebhookTeamParent webhookTeamParent() {
        return GitHubWebhookTeamParentBuilder.builder()
                .description("description")
                .enterpriseId(42L)
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .membersUrl("https://api.github.com/members_url{/id}")
                .name("name")
                .nodeId("node_id")
                .notificationSetting(GitHubWebhookTeamNotificationSetting.NOTIFICATIONS_ENABLED)
                .organizationId(37L)
                .permission("permission")
                .privacy(GitHubWebhookTeamPrivacy.OPEN)
                .repositoriesUrl("https://api.github.com/repositories_url")
                .slug("slug")
                .type(GitHubWebhookTeamType.ENTERPRISE)
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookTeamRemovedFromRepositoryEvent webhookTeamRemovedFromRepositoryEvent() {
        return GitHubWebhookTeamRemovedFromRepositoryEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookRepository())
                .sender(webhookSimpleUser())
                .team(webhookTeam())
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
