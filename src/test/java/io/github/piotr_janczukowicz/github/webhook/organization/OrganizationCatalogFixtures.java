package io.github.piotr_janczukowicz.github.webhook.organization;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookProjectCardEditedChangesNote;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;
import java.util.List;

final class OrganizationCatalogFixtures {

    private OrganizationCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMembership webhookMembership() {
        return GitHubWebhookMembershipBuilder.builder()
                .directMembership(true)
                .enterpriseTeamsProvidingIndirectMembership(List.of("enterprise_teams_providing_indirect_membership"))
                .organizationUrl("https://api.github.com/organization_url")
                .role("role")
                .state("state")
                .url("https://api.github.com/url")
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookOrganizationDeletedEvent webhookOrganizationDeletedEvent() {
        return GitHubWebhookOrganizationDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .membership(webhookMembership())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookOrganizationMemberAddedEvent webhookOrganizationMemberAddedEvent() {
        return GitHubWebhookOrganizationMemberAddedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .membership(webhookMembership())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookOrganizationMemberInvitedEvent webhookOrganizationMemberInvitedEvent() {
        return GitHubWebhookOrganizationMemberInvitedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .invitation(webhookOrganizationMemberInvitedInvitation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookOrganizationMemberInvitedInvitation webhookOrganizationMemberInvitedInvitation() {
        return GitHubWebhookOrganizationMemberInvitedInvitationBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .email("email")
                .failedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .failedReason("failed_reason")
                .id(1.5)
                .invitationSource("invitation_source")
                .invitationTeamsUrl("https://api.github.com/invitation_teams_url")
                .inviter(webhookUser())
                .login("login")
                .nodeId("node_id")
                .role("role")
                .teamCount(1.5)
                .build();
    }

    static GitHubWebhookOrganizationMemberRemovedEvent webhookOrganizationMemberRemovedEvent() {
        return GitHubWebhookOrganizationMemberRemovedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .membership(webhookMembership())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookOrganizationRenamedChanges webhookOrganizationRenamedChanges() {
        return GitHubWebhookOrganizationRenamedChangesBuilder.builder()
                .login(webhookProjectCardEditedChangesNote())
                .build();
    }

    static GitHubWebhookOrganizationRenamedEvent webhookOrganizationRenamedEvent() {
        return GitHubWebhookOrganizationRenamedEventBuilder.builder()
                .changes(webhookOrganizationRenamedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .membership(webhookMembership())
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
