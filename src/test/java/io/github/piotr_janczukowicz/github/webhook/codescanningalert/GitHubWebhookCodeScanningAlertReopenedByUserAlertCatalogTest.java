package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertReopenedByUserAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertReopenedByUserAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-reopened-by-user-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-reopened-by-user-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlert();
    }
}
