package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionResponse;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class DismissalRequestSecretScanningCatalogFixtures {

    private DismissalRequestSecretScanningCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDismissalRequestSecretScanningCancelledEvent
            webhookDismissalRequestSecretScanningCancelledEvent() {
        return GitHubWebhookDismissalRequestSecretScanningCancelledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDismissalRequestSecretScanningCompletedEvent
            webhookDismissalRequestSecretScanningCompletedEvent() {
        return GitHubWebhookDismissalRequestSecretScanningCompletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDismissalRequestSecretScanningCreatedEvent webhookDismissalRequestSecretScanningCreatedEvent() {
        return GitHubWebhookDismissalRequestSecretScanningCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDismissalRequestSecretScanningResponseDismissedEvent
            webhookDismissalRequestSecretScanningResponseDismissedEvent() {
        return GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .exemptionResponse(webhookExemptionResponse())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDismissalRequestSecretScanningResponseSubmittedEvent
            webhookDismissalRequestSecretScanningResponseSubmittedEvent() {
        return GitHubWebhookDismissalRequestSecretScanningResponseSubmittedEventBuilder.builder()
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
