package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningAlertDismissalRequestDataItemReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertDismissalRequestDataItemReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-dismissal-request-data-item-reason-schema.json";
    }
}
