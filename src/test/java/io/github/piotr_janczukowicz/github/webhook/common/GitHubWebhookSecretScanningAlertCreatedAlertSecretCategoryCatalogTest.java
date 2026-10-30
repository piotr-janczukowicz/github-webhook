package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningAlertCreatedAlertSecretCategoryCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertCreatedAlertSecretCategory.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-created-alert-secret-category-schema.json";
    }
}
