package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertFixedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertFixedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-fixed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-fixed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedEvent();
    }
}
