package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookAlertInstanceCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAlertInstance.class;
    }

    @Override
    protected String fixture() {
        return "webhook-alert-instance.json";
    }

    @Override
    protected String schema() {
        return "webhook-alert-instance-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookAlertInstance();
    }
}
