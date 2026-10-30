package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningAlertCreatedAlertValidityCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertCreatedAlertValidity.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-created-alert-validity-schema.json";
    }
}
