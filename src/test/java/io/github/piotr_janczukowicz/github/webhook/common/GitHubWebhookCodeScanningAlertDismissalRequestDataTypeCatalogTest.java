package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningAlertDismissalRequestDataTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertDismissalRequestDataType.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-dismissal-request-data-type-schema.json";
    }
}
