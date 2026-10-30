package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertDismissalRequestDataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertDismissalRequestData.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-dismissal-request-data.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-dismissal-request-data-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookCodeScanningAlertDismissalRequestData();
    }
}
