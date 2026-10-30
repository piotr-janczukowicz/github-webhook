package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningAlertFixedAlertRuleSeverityCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-fixed-alert-rule-severity-schema.json";
    }
}
