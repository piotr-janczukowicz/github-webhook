package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;

final class ProjectColumnCatalogFixtures {

    private ProjectColumnCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookProjectColumn webhookProjectColumn() {
        return GitHubWebhookProjectColumnBuilder.builder()
                .afterId(1L)
                .cardsUrl("https://api.github.com/cards_url")
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .projectUrl("https://api.github.com/project_url")
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookProjectColumnCreatedEvent webhookProjectColumnCreatedEvent() {
        return GitHubWebhookProjectColumnCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectColumn(webhookProjectColumn())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectColumnDeletedEvent webhookProjectColumnDeletedEvent() {
        return GitHubWebhookProjectColumnDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectColumn(webhookProjectColumn())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectColumnEditedChanges webhookProjectColumnEditedChanges() {
        return GitHubWebhookProjectColumnEditedChangesBuilder.builder()
                .name(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookProjectColumnEditedEvent webhookProjectColumnEditedEvent() {
        return GitHubWebhookProjectColumnEditedEventBuilder.builder()
                .changes(webhookProjectColumnEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectColumn(webhookProjectColumn())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookProjectColumnMovedEvent webhookProjectColumnMovedEvent() {
        return GitHubWebhookProjectColumnMovedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .projectColumn(webhookProjectColumn())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
