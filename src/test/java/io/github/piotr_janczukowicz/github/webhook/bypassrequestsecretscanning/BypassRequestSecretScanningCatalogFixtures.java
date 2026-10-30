package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionResponse;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class BypassRequestSecretScanningCatalogFixtures {

    private BypassRequestSecretScanningCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookBypassRequestSecretScanningCancelledEvent webhookBypassRequestSecretScanningCancelledEvent() {
        return GitHubWebhookBypassRequestSecretScanningCancelledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookBypassRequestSecretScanningCompletedEvent webhookBypassRequestSecretScanningCompletedEvent() {
        return GitHubWebhookBypassRequestSecretScanningCompletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookBypassRequestSecretScanningCreatedEvent webhookBypassRequestSecretScanningCreatedEvent() {
        return GitHubWebhookBypassRequestSecretScanningCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookBypassRequestSecretScanningResponseDismissedEvent
            webhookBypassRequestSecretScanningResponseDismissedEvent() {
        return GitHubWebhookBypassRequestSecretScanningResponseDismissedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .exemptionResponse(webhookExemptionResponse())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookBypassRequestSecretScanningResponseSubmittedEvent
            webhookBypassRequestSecretScanningResponseSubmittedEvent() {
        return GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .exemptionResponse(webhookExemptionResponse())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
