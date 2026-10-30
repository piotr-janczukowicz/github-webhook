package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedEvent();
    }
}
