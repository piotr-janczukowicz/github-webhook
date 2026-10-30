package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertReopenedAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertReopenedAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-reopened-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-reopened-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedAlert();
    }
}
