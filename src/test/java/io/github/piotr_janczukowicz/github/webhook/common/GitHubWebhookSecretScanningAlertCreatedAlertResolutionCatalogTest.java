package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningAlertCreatedAlertResolutionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertCreatedAlertResolution.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-created-alert-resolution-schema.json";
    }
}
