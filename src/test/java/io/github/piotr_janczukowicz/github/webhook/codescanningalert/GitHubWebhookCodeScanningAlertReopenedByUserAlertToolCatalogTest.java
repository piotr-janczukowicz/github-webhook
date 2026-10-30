package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertReopenedByUserAlertToolCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertReopenedByUserAlertTool.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-reopened-by-user-alert-tool.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-reopened-by-user-alert-tool-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertReopenedByUserAlertTool();
    }
}
