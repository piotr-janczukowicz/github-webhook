package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertFixedAlertRuleCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertFixedAlertRule.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-fixed-alert-rule.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-fixed-alert-rule-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlertRule();
    }
}
