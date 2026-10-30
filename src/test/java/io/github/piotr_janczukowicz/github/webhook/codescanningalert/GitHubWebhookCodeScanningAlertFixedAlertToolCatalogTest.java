package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertFixedAlertToolCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertFixedAlertTool.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-fixed-alert-tool.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-fixed-alert-tool-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertFixedAlertTool();
    }
}
