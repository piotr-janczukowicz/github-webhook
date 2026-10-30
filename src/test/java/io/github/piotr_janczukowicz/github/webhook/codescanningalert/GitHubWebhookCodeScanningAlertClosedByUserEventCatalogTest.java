package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertClosedByUserEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertClosedByUserEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-closed-by-user-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-closed-by-user-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserEvent();
    }
}
