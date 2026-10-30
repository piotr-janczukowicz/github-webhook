package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestLicenseComplianceCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestLicenseComplianceCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-license-compliance-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-license-compliance-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestLicenseComplianceCatalogFixtures
                .webhookDismissalRequestLicenseComplianceCancelledEvent();
    }
}
