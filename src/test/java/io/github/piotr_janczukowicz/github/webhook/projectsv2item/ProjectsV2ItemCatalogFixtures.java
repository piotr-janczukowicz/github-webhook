package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookMemberEditedChangesPermission;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;
import java.util.Map;

final class ProjectsV2ItemCatalogFixtures {

    private ProjectsV2ItemCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookProjectsV2Item webhookProjectsV2Item() {
        return GitHubWebhookProjectsV2ItemBuilder.builder()
                .archivedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .contentNodeId("content_node_id")
                .contentType(GitHubWebhookProjectsV2ItemContentType.ISSUE)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .creator(webhookSimpleUser())
                .id(1.5)
                .nodeId("node_id")
                .projectNodeId("project_node_id")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookProjectsV2ItemArchivedChanges webhookProjectsV2ItemArchivedChanges() {
        return GitHubWebhookProjectsV2ItemArchivedChangesBuilder.builder()
                .archivedAt(webhookProjectsV2ItemArchivedChangesArchivedAt())
                .build();
    }

    static GitHubWebhookProjectsV2ItemArchivedChangesArchivedAt webhookProjectsV2ItemArchivedChangesArchivedAt() {
        return GitHubWebhookProjectsV2ItemArchivedChangesArchivedAtBuilder.builder()
                .from(Instant.parse("2026-01-01T00:00:00Z"))
                .to(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookProjectsV2ItemArchivedEvent webhookProjectsV2ItemArchivedEvent() {
        return GitHubWebhookProjectsV2ItemArchivedEventBuilder.builder()
                .changes(webhookProjectsV2ItemArchivedChanges())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2Item(webhookProjectsV2Item())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2ItemConvertedChanges webhookProjectsV2ItemConvertedChanges() {
        return GitHubWebhookProjectsV2ItemConvertedChangesBuilder.builder()
                .contentType(webhookMemberEditedChangesPermission())
                .build();
    }

    static GitHubWebhookProjectsV2ItemConvertedEvent webhookProjectsV2ItemConvertedEvent() {
        return GitHubWebhookProjectsV2ItemConvertedEventBuilder.builder()
                .changes(webhookProjectsV2ItemConvertedChanges())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2Item(webhookProjectsV2Item())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2ItemCreatedEvent webhookProjectsV2ItemCreatedEvent() {
        return GitHubWebhookProjectsV2ItemCreatedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2Item(webhookProjectsV2Item())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2ItemDeletedEvent webhookProjectsV2ItemDeletedEvent() {
        return GitHubWebhookProjectsV2ItemDeletedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2Item(webhookProjectsV2Item())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2ItemEditedChangesBody webhookProjectsV2ItemEditedChangesBody() {
        return GitHubWebhookProjectsV2ItemEditedChangesBodyBuilder.builder()
                .body(webhookMemberEditedChangesPermission())
                .build();
    }

    static GitHubWebhookProjectsV2ItemEditedChangesFieldValue webhookProjectsV2ItemEditedChangesFieldValue() {
        return GitHubWebhookProjectsV2ItemEditedChangesFieldValueBuilder.builder()
                .fieldValue(webhookProjectsV2ItemEditedChangesFieldValueValue())
                .build();
    }

    static GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue webhookProjectsV2ItemEditedChangesFieldValueValue() {
        return GitHubWebhookProjectsV2ItemEditedChangesFieldValueValueBuilder.builder()
                .fieldName("field_name")
                .fieldNodeId("field_node_id")
                .fieldType("field_type")
                .from(Map.of("id", "id", "name", "name"))
                .projectNumber(1L)
                .to(Map.of("id", "id", "name", "name"))
                .build();
    }

    static GitHubWebhookProjectsV2ItemEditedEvent webhookProjectsV2ItemEditedEvent() {
        return GitHubWebhookProjectsV2ItemEditedEventBuilder.builder()
                .changes(webhookProjectsV2ItemEditedChangesFieldValue())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2Item(webhookProjectsV2Item())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2ItemReorderedChanges webhookProjectsV2ItemReorderedChanges() {
        return GitHubWebhookProjectsV2ItemReorderedChangesBuilder.builder()
                .previousProjectsV2ItemNodeId(webhookMemberEditedChangesPermission())
                .build();
    }

    static GitHubWebhookProjectsV2ItemReorderedEvent webhookProjectsV2ItemReorderedEvent() {
        return GitHubWebhookProjectsV2ItemReorderedEventBuilder.builder()
                .changes(webhookProjectsV2ItemReorderedChanges())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2Item(webhookProjectsV2Item())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectsV2ItemRestoredEvent webhookProjectsV2ItemRestoredEvent() {
        return GitHubWebhookProjectsV2ItemRestoredEventBuilder.builder()
                .changes(webhookProjectsV2ItemArchivedChanges())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectsV2Item(webhookProjectsV2Item())
                .sender(webhookSimpleUser())
                .build();
    }
}
