package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningToolSecurityAlertsThresholdCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningToolSecurityAlertsThreshold.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-tool-security-alerts-threshold-schema.json";
    }
}
