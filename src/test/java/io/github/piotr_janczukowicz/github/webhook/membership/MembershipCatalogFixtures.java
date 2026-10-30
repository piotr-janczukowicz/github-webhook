package io.github.piotr_janczukowicz.github.webhook.membership;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamNotificationSetting;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamPrivacy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;

final class MembershipCatalogFixtures {

    private MembershipCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMembershipAddedEvent webhookMembershipAddedEvent() {
        return GitHubWebhookMembershipAddedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .member(webhookUser())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .scope(GitHubWebhookMembershipAddedScope.TEAM)
                .sender(webhookUser())
                .team(webhookTeam())
                .build();
    }

    static GitHubWebhookMembershipRemovedEvent webhookMembershipRemovedEvent() {
        return GitHubWebhookMembershipRemovedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .member(webhookUser())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .scope(GitHubWebhookMembershipRemovedScope.TEAM)
                .sender(webhookUser())
                .team(webhookTeam())
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
