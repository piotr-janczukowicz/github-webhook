package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertCreatedAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertCreatedAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-created-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-created-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecretScanningAlertCreatedAlert();
    }
}
