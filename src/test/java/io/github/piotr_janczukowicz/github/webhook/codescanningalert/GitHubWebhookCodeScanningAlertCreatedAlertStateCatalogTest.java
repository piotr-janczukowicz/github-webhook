package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningAlertCreatedAlertStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertCreatedAlertState.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-created-alert-state-schema.json";
    }
}
