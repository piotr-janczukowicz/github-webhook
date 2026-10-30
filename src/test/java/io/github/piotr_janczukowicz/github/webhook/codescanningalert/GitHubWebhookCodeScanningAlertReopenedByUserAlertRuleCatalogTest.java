package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertReopenedByUserAlertRuleCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertReopenedByUserAlertRule.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-reopened-by-user-alert-rule.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-reopened-by-user-alert-rule-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlertRule();
    }
}
