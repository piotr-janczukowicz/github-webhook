package io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionResponse;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class DismissalRequestCodeScanningCatalogFixtures {

    private DismissalRequestCodeScanningCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDismissalRequestCodeScanningCreatedEvent webhookDismissalRequestCodeScanningCreatedEvent() {
        return GitHubWebhookDismissalRequestCodeScanningCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEvent
            webhookDismissalRequestCodeScanningResponseSubmittedEvent() {
        return GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventBuilder.builder()
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
