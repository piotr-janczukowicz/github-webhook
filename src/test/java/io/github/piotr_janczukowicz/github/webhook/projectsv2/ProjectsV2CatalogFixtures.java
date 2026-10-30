package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookMemberEditedChangesPermission;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookProjectsV2StatusUpdate;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import java.time.Instant;

final class ProjectsV2CatalogFixtures {

    private ProjectsV2CatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookProjectsV2ClosedEvent webhookProjectsV2ClosedEvent() {
        return GitHubWebhookProjectsV2ClosedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2(webhookProjectsV2Project())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2CreatedEvent webhookProjectsV2CreatedEvent() {
        return GitHubWebhookProjectsV2CreatedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2(webhookProjectsV2Project())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2DeletedEvent webhookProjectsV2DeletedEvent() {
        return GitHubWebhookProjectsV2DeletedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2(webhookProjectsV2Project())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2EditedChanges webhookProjectsV2EditedChanges() {
        return GitHubWebhookProjectsV2EditedChangesBuilder.builder()
                .description(webhookMemberEditedChangesPermission())
                .publicValue(webhookProjectsV2EditedChangesPublic())
                .shortDescription(webhookMemberEditedChangesPermission())
                .title(webhookMemberEditedChangesPermission())
                .build();
    }

    static GitHubWebhookProjectsV2EditedChangesPublic webhookProjectsV2EditedChangesPublic() {
        return GitHubWebhookProjectsV2EditedChangesPublicBuilder.builder()
                .from(true)
                .to(true)
                .build();
    }

    static GitHubWebhookProjectsV2EditedEvent webhookProjectsV2EditedEvent() {
        return GitHubWebhookProjectsV2EditedEventBuilder.builder()
                .changes(webhookProjectsV2EditedChanges())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2(webhookProjectsV2Project())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2Project webhookProjectsV2Project() {
        return GitHubWebhookProjectsV2ProjectBuilder.builder()
                .closedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookSimpleUser())
                .deletedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .deletedBy(webhookSimpleUser())
                .description("description")
                .id(1.5)
                .isTemplate(true)
                .latestStatusUpdate(webhookProjectsV2StatusUpdate())
                .nodeId("node_id")
                .number(1L)
                .owner(webhookSimpleUser())
                .publicValue(true)
                .shortDescription("short_description")
                .state(GitHubWebhookMilestoneState.OPEN)
                .title("title")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookProjectsV2ReopenedEvent webhookProjectsV2ReopenedEvent() {
        return GitHubWebhookProjectsV2ReopenedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2(webhookProjectsV2Project())
                .sender(webhookSimpleUser())
                .build();
    }
}
