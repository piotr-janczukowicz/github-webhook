package io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-code-scanning-response-submitted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-code-scanning-response-submitted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestCodeScanningCatalogFixtures.webhookDismissalRequestCodeScanningResponseSubmittedEvent();
    }
}
