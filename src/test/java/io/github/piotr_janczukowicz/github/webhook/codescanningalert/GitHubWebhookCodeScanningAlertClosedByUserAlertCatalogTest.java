package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertClosedByUserAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertClosedByUserAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-closed-by-user-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-closed-by-user-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertClosedByUserAlert();
    }
}
