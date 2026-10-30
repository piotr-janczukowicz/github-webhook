package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-license-compliance-response-submitted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-license-compliance-response-submitted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestLicenseComplianceCatalogFixtures
                .webhookDismissalRequestLicenseComplianceResponseSubmittedEvent();
    }
}
