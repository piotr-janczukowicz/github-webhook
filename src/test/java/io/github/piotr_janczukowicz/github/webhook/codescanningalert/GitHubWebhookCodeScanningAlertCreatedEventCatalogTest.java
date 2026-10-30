package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertCreatedEvent();
    }
}
