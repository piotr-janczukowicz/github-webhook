package io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestCodeScanningCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestCodeScanningCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-code-scanning-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-code-scanning-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestCodeScanningCatalogFixtures.webhookDismissalRequestCodeScanningCreatedEvent();
    }
}
