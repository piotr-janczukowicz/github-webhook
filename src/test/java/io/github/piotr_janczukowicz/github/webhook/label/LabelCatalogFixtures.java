package io.github.piotr_janczukowicz.github.webhook.label;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedChangesBody;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssuesEditedLabel;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;

final class LabelCatalogFixtures {

    private LabelCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookArchivedLabel webhookArchivedLabel() {
        return GitHubWebhookArchivedLabelBuilder.builder()
                .archivedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .archivedBy(webhookSimpleUser())
                .color("color")
                .defaultValue(true)
                .description("description")
                .id(1L)
                .name("name")
                .nodeId("node_id")
                .url("https://api.github.com/url")
                .build();
    }

    static GitHubWebhookLabelArchivedEvent webhookLabelArchivedEvent() {
        return GitHubWebhookLabelArchivedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .label(webhookArchivedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookLabelCreatedEvent webhookLabelCreatedEvent() {
        return GitHubWebhookLabelCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookLabelDeletedEvent webhookLabelDeletedEvent() {
        return GitHubWebhookLabelDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookLabelEditedChanges webhookLabelEditedChanges() {
        return GitHubWebhookLabelEditedChangesBuilder.builder()
                .color(webhookIssuesEditedChangesBody())
                .description(webhookIssuesEditedChangesBody())
                .name(webhookIssuesEditedChangesBody())
                .build();
    }

    static GitHubWebhookLabelEditedEvent webhookLabelEditedEvent() {
        return GitHubWebhookLabelEditedEventBuilder.builder()
                .changes(webhookLabelEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookLabelUnarchivedEvent webhookLabelUnarchivedEvent() {
        return GitHubWebhookLabelUnarchivedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .label(webhookIssuesEditedLabel())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
