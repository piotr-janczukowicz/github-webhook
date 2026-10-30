package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionRequest;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookExemptionResponse;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class DismissalRequestLicenseComplianceCatalogFixtures {

    private DismissalRequestLicenseComplianceCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookDismissalRequestLicenseComplianceCancelledEvent
            webhookDismissalRequestLicenseComplianceCancelledEvent() {
        return GitHubWebhookDismissalRequestLicenseComplianceCancelledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDismissalRequestLicenseComplianceCreatedEvent
            webhookDismissalRequestLicenseComplianceCreatedEvent() {
        return GitHubWebhookDismissalRequestLicenseComplianceCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .exemptionRequest(webhookExemptionRequest())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEvent
            webhookDismissalRequestLicenseComplianceResponseSubmittedEvent() {
        return GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventBuilder.builder()
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
