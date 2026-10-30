package io.github.piotr_janczukowicz.github.webhook.repository;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookProjectCardEditedChangesNote;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepositoryEditedChangesTopics;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;

final class RepositoryCatalogFixtures {

    private RepositoryCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookOrganization webhookOrganization() {
        return GitHubWebhookOrganizationBuilder.builder()
                .avatarUrl("https://api.github.com/avatar_url")
                .description("description")
                .eventsUrl("https://api.github.com/events_url")
                .hooksUrl("https://api.github.com/hooks_url")
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .issuesUrl("https://api.github.com/issues_url")
                .login("login")
                .membersUrl("https://api.github.com/members_url{/id}")
                .nodeId("node_id")
                .publicMembersUrl("https://api.github.com/public_members_url{/id}")
                .reposUrl("https://api.github.com/repos_url")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookRepositoryAnonymousAccessDisabledEvent webhookRepositoryAnonymousAccessDisabledEvent() {
        return GitHubWebhookRepositoryAnonymousAccessDisabledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryAnonymousAccessEnabledEvent webhookRepositoryAnonymousAccessEnabledEvent() {
        return GitHubWebhookRepositoryAnonymousAccessEnabledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryArchivedEvent webhookRepositoryArchivedEvent() {
        return GitHubWebhookRepositoryArchivedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryCreatedEvent webhookRepositoryCreatedEvent() {
        return GitHubWebhookRepositoryCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryDeletedEvent webhookRepositoryDeletedEvent() {
        return GitHubWebhookRepositoryDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryEditedChanges webhookRepositoryEditedChanges() {
        return GitHubWebhookRepositoryEditedChangesBuilder.builder()
                .defaultBranch(webhookIssuesEditedChangesBody())
                .description(webhookProjectCardEditedChangesNote())
                .homepage(webhookProjectCardEditedChangesNote())
                .topics(webhookRepositoryEditedChangesTopics())
                .build();
    }

    static GitHubWebhookRepositoryEditedEvent webhookRepositoryEditedEvent() {
        return GitHubWebhookRepositoryEditedEventBuilder.builder()
                .changes(webhookRepositoryEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryPrivatizedEvent webhookRepositoryPrivatizedEvent() {
        return GitHubWebhookRepositoryPrivatizedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryPublicizedEvent webhookRepositoryPublicizedEvent() {
        return GitHubWebhookRepositoryPublicizedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryRenamedChanges webhookRepositoryRenamedChanges() {
        return GitHubWebhookRepositoryRenamedChangesBuilder.builder()
                .repository(webhookRepositoryRenamedChangesRepository())
                .build();
    }

    static GitHubWebhookRepositoryRenamedChangesRepository webhookRepositoryRenamedChangesRepository() {
        return GitHubWebhookRepositoryRenamedChangesRepositoryBuilder.builder()
                .name(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookRepositoryRenamedEvent webhookRepositoryRenamedEvent() {
        return GitHubWebhookRepositoryRenamedEventBuilder.builder()
                .changes(webhookRepositoryRenamedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryTransferredChanges webhookRepositoryTransferredChanges() {
        return GitHubWebhookRepositoryTransferredChangesBuilder.builder()
                .owner(webhookRepositoryTransferredChangesOwner())
                .build();
    }

    static GitHubWebhookRepositoryTransferredChangesOwner webhookRepositoryTransferredChangesOwner() {
        return GitHubWebhookRepositoryTransferredChangesOwnerBuilder.builder()
                .from(webhookRepositoryTransferredChangesOwnerFrom())
                .build();
    }

    static GitHubWebhookRepositoryTransferredChangesOwnerFrom webhookRepositoryTransferredChangesOwnerFrom() {
        return GitHubWebhookRepositoryTransferredChangesOwnerFromBuilder.builder()
                .organization(webhookOrganization())
                .user(webhookUser())
                .build();
    }

    static GitHubWebhookRepositoryTransferredEvent webhookRepositoryTransferredEvent() {
        return GitHubWebhookRepositoryTransferredEventBuilder.builder()
                .changes(webhookRepositoryTransferredChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookRepositoryUnarchivedEvent webhookRepositoryUnarchivedEvent() {
        return GitHubWebhookRepositoryUnarchivedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
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
