package io.github.piotr_janczukowicz.github.webhook.installation;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookInstallationCreatedRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.util.List;

final class InstallationCatalogFixtures {

    private InstallationCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookInstallationCreatedEvent webhookInstallationCreatedEvent() {
        return GitHubWebhookInstallationCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookInstallation())
                .organization(webhookOrganizationSimple())
                .repositories(List.of(webhookInstallationCreatedRepository()))
                .repository(webhookForkRepository())
                .requester(webhookUser())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookInstallationDeletedEvent webhookInstallationDeletedEvent() {
        return GitHubWebhookInstallationDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookInstallation())
                .organization(webhookOrganizationSimple())
                .repositories(List.of(webhookInstallationCreatedRepository()))
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookInstallationNewPermissionsAcceptedEvent webhookInstallationNewPermissionsAcceptedEvent() {
        return GitHubWebhookInstallationNewPermissionsAcceptedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookInstallation())
                .organization(webhookOrganizationSimple())
                .repositories(List.of(webhookInstallationCreatedRepository()))
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookInstallationSuspendEvent webhookInstallationSuspendEvent() {
        return GitHubWebhookInstallationSuspendEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookInstallation())
                .organization(webhookOrganizationSimple())
                .repositories(List.of(webhookInstallationCreatedRepository()))
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookInstallationUnsuspendEvent webhookInstallationUnsuspendEvent() {
        return GitHubWebhookInstallationUnsuspendEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookInstallation())
                .organization(webhookOrganizationSimple())
                .repositories(List.of(webhookInstallationCreatedRepository()))
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
