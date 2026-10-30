package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSecretScanningAlertCreatedAlert;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class SecretScanningAlertCatalogFixtures {

    private SecretScanningAlertCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookSecretScanningAlertAssignedEvent webhookSecretScanningAlertAssignedEvent() {
        return GitHubWebhookSecretScanningAlertAssignedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .assignee(webhookSimpleUser())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertCreatedEvent webhookSecretScanningAlertCreatedEvent() {
        return GitHubWebhookSecretScanningAlertCreatedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertMetadataCreatedEvent webhookSecretScanningAlertMetadataCreatedEvent() {
        return GitHubWebhookSecretScanningAlertMetadataCreatedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertMetadataRemovedEvent webhookSecretScanningAlertMetadataRemovedEvent() {
        return GitHubWebhookSecretScanningAlertMetadataRemovedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertPubliclyLeakedEvent webhookSecretScanningAlertPubliclyLeakedEvent() {
        return GitHubWebhookSecretScanningAlertPubliclyLeakedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertReopenedEvent webhookSecretScanningAlertReopenedEvent() {
        return GitHubWebhookSecretScanningAlertReopenedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertResolvedEvent webhookSecretScanningAlertResolvedEvent() {
        return GitHubWebhookSecretScanningAlertResolvedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertUnassignedEvent webhookSecretScanningAlertUnassignedEvent() {
        return GitHubWebhookSecretScanningAlertUnassignedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .assignee(webhookSimpleUser())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookSecretScanningAlertValidatedEvent webhookSecretScanningAlertValidatedEvent() {
        return GitHubWebhookSecretScanningAlertValidatedEventBuilder.builder()
                .alert(webhookSecretScanningAlertCreatedAlert())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
