package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookProjectCardEditedChangesNote;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAssigneeType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;

final class ProjectCardCatalogFixtures {

    private ProjectCardCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookProjectCard webhookProjectCard() {
        return GitHubWebhookProjectCardBuilder.builder()
                .afterId(1L)
                .archived(true)
                .columnId(1L)
                .columnUrl("https://api.github.com/column_url")
                .contentUrl("https://api.github.com/content_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookUser())
                .id(1L)
                .nodeId("node_id")
                .note("note")
                .projectUrl("https://api.github.com/project_url")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookProjectCardConvertedChanges webhookProjectCardConvertedChanges() {
        return GitHubWebhookProjectCardConvertedChangesBuilder.builder()
                .note(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookProjectCardConvertedEvent webhookProjectCardConvertedEvent() {
        return GitHubWebhookProjectCardConvertedEventBuilder.builder()
                .changes(webhookProjectCardConvertedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectCard(webhookProjectCard())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectCardCreatedEvent webhookProjectCardCreatedEvent() {
        return GitHubWebhookProjectCardCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectCard(webhookProjectCard())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectCardDeletedEvent webhookProjectCardDeletedEvent() {
        return GitHubWebhookProjectCardDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectCard(webhookProjectCardDeletedProjectCard())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectCardDeletedProjectCard webhookProjectCardDeletedProjectCard() {
        return GitHubWebhookProjectCardDeletedProjectCardBuilder.builder()
                .afterId(1L)
                .archived(true)
                .columnId(1L)
                .columnUrl("https://api.github.com/column_url")
                .contentUrl("https://api.github.com/content_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookProjectCardMovedProjectCardCreator())
                .id(1L)
                .nodeId("node_id")
                .note("note")
                .projectUrl("https://api.github.com/project_url")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookProjectCardEditedChanges webhookProjectCardEditedChanges() {
        return GitHubWebhookProjectCardEditedChangesBuilder.builder()
                .note(webhookProjectCardEditedChangesNote())
                .build();
    }

    static GitHubWebhookProjectCardEditedEvent webhookProjectCardEditedEvent() {
        return GitHubWebhookProjectCardEditedEventBuilder.builder()
                .changes(webhookProjectCardEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectCard(webhookProjectCard())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectCardMovedChanges webhookProjectCardMovedChanges() {
        return GitHubWebhookProjectCardMovedChangesBuilder.builder()
                .columnId(webhookProjectCardMovedChangesColumnId())
                .build();
    }

    static GitHubWebhookProjectCardMovedChangesColumnId webhookProjectCardMovedChangesColumnId() {
        return GitHubWebhookProjectCardMovedChangesColumnIdBuilder.builder()
                .from(1L)
                .build();
    }

    static GitHubWebhookProjectCardMovedEvent webhookProjectCardMovedEvent() {
        return GitHubWebhookProjectCardMovedEventBuilder.builder()
                .changes(webhookProjectCardMovedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectCard(webhookProjectCardMovedProjectCard())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectCardMovedProjectCard webhookProjectCardMovedProjectCard() {
        return GitHubWebhookProjectCardMovedProjectCardBuilder.builder()
                .afterId(1L)
                .archived(true)
                .columnId(1L)
                .columnUrl("column_url")
                .contentUrl("https://api.github.com/content_url")
                .createdAt("created_at")
                .creator(webhookProjectCardMovedProjectCardCreator())
                .id(1L)
                .nodeId("node_id")
                .note("note")
                .projectUrl("project_url")
                .updatedAt("updated_at")
                .url("url")
                .build();
    }

    static GitHubWebhookProjectCardMovedProjectCardCreator webhookProjectCardMovedProjectCardCreator() {
        return GitHubWebhookProjectCardMovedProjectCardCreatorBuilder.builder()
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
                .type(GitHubWebhookIssueAssigneeType.BOT)
                .url("https://api.github.com/url")
                .userViewType("user_view_type")
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
