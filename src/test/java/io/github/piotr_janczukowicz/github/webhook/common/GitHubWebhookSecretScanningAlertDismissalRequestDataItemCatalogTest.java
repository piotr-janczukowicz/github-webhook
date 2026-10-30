package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertDismissalRequestDataItemCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertDismissalRequestDataItem.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-dismissal-request-data-item.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-dismissal-request-data-item-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecretScanningAlertDismissalRequestDataItem();
    }
}
