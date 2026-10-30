package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningToolAlertsThresholdCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningToolAlertsThreshold.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-tool-alerts-threshold-schema.json";
    }
}
