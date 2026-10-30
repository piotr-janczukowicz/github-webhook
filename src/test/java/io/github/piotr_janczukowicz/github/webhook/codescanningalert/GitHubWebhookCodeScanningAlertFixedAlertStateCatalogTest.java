package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningAlertFixedAlertStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertFixedAlertState.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-fixed-alert-state-schema.json";
    }
}
