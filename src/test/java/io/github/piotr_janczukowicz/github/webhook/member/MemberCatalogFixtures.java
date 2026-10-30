package io.github.piotr_janczukowicz.github.webhook.member;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookMemberEditedChangesPermission;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;

final class MemberCatalogFixtures {

    private MemberCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMemberAddedChanges webhookMemberAddedChanges() {
        return GitHubWebhookMemberAddedChangesBuilder.builder()
                .permission(webhookMemberAddedChangesPermission())
                .roleName(webhookMemberAddedChangesRoleName())
                .build();
    }

    static GitHubWebhookMemberAddedChangesPermission webhookMemberAddedChangesPermission() {
        return GitHubWebhookMemberAddedChangesPermissionBuilder.builder()
                .to(GitHubWebhookMemberAddedChangesPermissionTo.WRITE)
                .build();
    }

    static GitHubWebhookMemberAddedChangesRoleName webhookMemberAddedChangesRoleName() {
        return GitHubWebhookMemberAddedChangesRoleNameBuilder.builder().to("to").build();
    }

    static GitHubWebhookMemberAddedEvent webhookMemberAddedEvent() {
        return GitHubWebhookMemberAddedEventBuilder.builder()
                .changes(webhookMemberAddedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .member(webhookUser())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMemberEditedChanges webhookMemberEditedChanges() {
        return GitHubWebhookMemberEditedChangesBuilder.builder()
                .oldPermission(webhookIssuesEditedChangesBody())
                .permission(webhookMemberEditedChangesPermission())
                .build();
    }

    static GitHubWebhookMemberEditedEvent webhookMemberEditedEvent() {
        return GitHubWebhookMemberEditedEventBuilder.builder()
                .changes(webhookMemberEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .member(webhookUser())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMemberRemovedEvent webhookMemberRemovedEvent() {
        return GitHubWebhookMemberRemovedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .member(webhookUser())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
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
