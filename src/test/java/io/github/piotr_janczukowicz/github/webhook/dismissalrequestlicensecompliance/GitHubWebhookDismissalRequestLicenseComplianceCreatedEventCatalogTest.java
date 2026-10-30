package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestLicenseComplianceCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestLicenseComplianceCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-license-compliance-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-license-compliance-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestLicenseComplianceCatalogFixtures.webhookDismissalRequestLicenseComplianceCreatedEvent();
    }
}
