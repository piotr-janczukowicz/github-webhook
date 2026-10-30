package io.github.piotr_janczukowicz.github.webhook.project;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;

final class ProjectCatalogFixtures {

    private ProjectCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookProject webhookProject() {
        return GitHubWebhookProjectBuilder.builder()
                .body("body")
                .columnsUrl("https://api.github.com/columns_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookUser())
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .number(1L)
                .ownerUrl("https://api.github.com/owner_url")
                .state(GitHubWebhookMilestoneState.OPEN)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookProjectClosedEvent webhookProjectClosedEvent() {
        return GitHubWebhookProjectClosedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .project(webhookProject())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectCreatedEvent webhookProjectCreatedEvent() {
        return GitHubWebhookProjectCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .project(webhookProject())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectDeletedEvent webhookProjectDeletedEvent() {
        return GitHubWebhookProjectDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .project(webhookProject())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectEditedChanges webhookProjectEditedChanges() {
        return GitHubWebhookProjectEditedChangesBuilder.builder()
                .body(webhookIssuesEditedChangesBody())
                .name(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookProjectEditedEvent webhookProjectEditedEvent() {
        return GitHubWebhookProjectEditedEventBuilder.builder()
                .changes(webhookProjectEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .project(webhookProject())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectReopenedEvent webhookProjectReopenedEvent() {
        return GitHubWebhookProjectReopenedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .project(webhookProject())
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
