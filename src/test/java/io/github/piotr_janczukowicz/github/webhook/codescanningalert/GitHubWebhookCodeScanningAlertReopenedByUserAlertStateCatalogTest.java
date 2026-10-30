package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningAlertReopenedByUserAlertStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertReopenedByUserAlertState.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-reopened-by-user-alert-state-schema.json";
    }
}
