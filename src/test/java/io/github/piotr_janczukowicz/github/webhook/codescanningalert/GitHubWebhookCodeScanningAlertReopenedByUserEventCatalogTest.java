package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertReopenedByUserEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertReopenedByUserEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-reopened-by-user-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-reopened-by-user-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserEvent();
    }
}
