package io.github.piotr_janczukowicz.github.webhook.milestone;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAssigneeType;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookUserType;
import java.time.Instant;

final class MilestoneCatalogFixtures {

    private MilestoneCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookMilestone webhookMilestone() {
        return GitHubWebhookMilestoneBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedIssues(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookUser())
                .description("description")
                .dueOn(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labelsUrl("https://api.github.com/labels_url")
                .nodeId("node_id")
                .number(1L)
                .openIssues(1L)
                .state(GitHubWebhookMilestoneState.OPEN)
                .title("title")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookMilestoneClosedEvent webhookMilestoneClosedEvent() {
        return GitHubWebhookMilestoneClosedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .milestone(webhookMilestone())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMilestoneCreatedEvent webhookMilestoneCreatedEvent() {
        return GitHubWebhookMilestoneCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .milestone(webhookMilestoneOpenedMilestone())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMilestoneDeletedEvent webhookMilestoneDeletedEvent() {
        return GitHubWebhookMilestoneDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .milestone(webhookMilestone())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMilestoneEditedChanges webhookMilestoneEditedChanges() {
        return GitHubWebhookMilestoneEditedChangesBuilder.builder()
                .description(webhookIssuesEditedChangesBody())
                .dueOn(webhookIssuesEditedChangesBody())
                .title(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookMilestoneEditedEvent webhookMilestoneEditedEvent() {
        return GitHubWebhookMilestoneEditedEventBuilder.builder()
                .changes(webhookMilestoneEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .milestone(webhookMilestone())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMilestoneOpenedEvent webhookMilestoneOpenedEvent() {
        return GitHubWebhookMilestoneOpenedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .milestone(webhookMilestoneOpenedMilestone())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookMilestoneOpenedMilestone webhookMilestoneOpenedMilestone() {
        return GitHubWebhookMilestoneOpenedMilestoneBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .closedIssues(1L)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookMilestoneOpenedMilestoneCreator())
                .description("description")
                .dueOn(Instant.parse("2026-01-01T00:00:00Z"))
                .htmlUrl("https://api.github.com/html_url")
                .id(1L)
                .labelsUrl("https://api.github.com/labels_url")
                .nodeId("node_id")
                .number(1L)
                .openIssues(1L)
                .state(GitHubWebhookMilestoneState.OPEN)
                .title("title")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookMilestoneOpenedMilestoneCreator webhookMilestoneOpenedMilestoneCreator() {
        return GitHubWebhookMilestoneOpenedMilestoneCreatorBuilder.builder()
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
                .type(GitHubWebhookIssueAssigneeType.BOT)
                .url("https://api.github.com/url")
                .userViewType("user_view_type")
                .build();
    }
}
