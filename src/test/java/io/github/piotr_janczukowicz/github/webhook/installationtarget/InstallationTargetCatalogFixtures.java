package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class InstallationTargetCatalogFixtures {

    private InstallationTargetCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookInstallationTargetRenamedAccount webhookInstallationTargetRenamedAccount() {
        return GitHubWebhookInstallationTargetRenamedAccountBuilder.builder()
                .archivedAt("archived_at")
                .avatarUrl("avatar_url")
                .createdAt("created_at")
                .eventsUrl("events_url")
                .followers(1L)
                .followersUrl("followers_url")
                .following(1L)
                .followingUrl("following_url")
                .gistsUrl("gists_url")
                .gravatarId("gravatar_id")
                .hasOrganizationProjects(true)
                .hasRepositoryProjects(true)
                .hooksUrl("hooks_url")
                .htmlUrl("html_url")
                .id(1L)
                .isVerified(true)
                .issuesUrl("issues_url")
                .login("login")
                .membersUrl("members_url")
                .name("name")
                .nodeId("node_id")
                .organizationsUrl("organizations_url")
                .publicGists(1L)
                .publicMembersUrl("public_members_url")
                .publicRepos(1L)
                .receivedEventsUrl("received_events_url")
                .reposUrl("repos_url")
                .siteAdmin(true)
                .slug("slug")
                .starredUrl("starred_url")
                .subscriptionsUrl("subscriptions_url")
                .type("type")
                .updatedAt("updated_at")
                .url("url")
                .userViewType("user_view_type")
                .build();
    }

    static GitHubWebhookInstallationTargetRenamedChanges webhookInstallationTargetRenamedChanges() {
        return GitHubWebhookInstallationTargetRenamedChangesBuilder.builder()
                .login(webhookIssuesEditedChangesBody())
                .slug(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookInstallationTargetRenamedEvent webhookInstallationTargetRenamedEvent() {
        return GitHubWebhookInstallationTargetRenamedEventBuilder.builder()
                .account(webhookInstallationTargetRenamedAccount())
                .changes(webhookInstallationTargetRenamedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .targetType("target_type")
                .build();
    }
}
