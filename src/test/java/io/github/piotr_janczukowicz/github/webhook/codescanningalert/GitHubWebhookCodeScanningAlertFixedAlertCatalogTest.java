package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertFixedAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertFixedAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-fixed-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-fixed-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlert();
    }
}
