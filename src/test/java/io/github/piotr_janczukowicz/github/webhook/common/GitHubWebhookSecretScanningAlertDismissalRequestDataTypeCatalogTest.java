package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningAlertDismissalRequestDataTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertDismissalRequestDataType.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-dismissal-request-data-type-schema.json";
    }
}
