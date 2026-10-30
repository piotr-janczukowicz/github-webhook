package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningAlertClosedByUserAlertStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertClosedByUserAlertState.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-closed-by-user-alert-state-schema.json";
    }
}
