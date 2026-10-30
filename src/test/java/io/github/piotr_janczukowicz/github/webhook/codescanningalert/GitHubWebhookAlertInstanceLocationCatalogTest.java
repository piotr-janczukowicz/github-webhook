package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookAlertInstanceLocationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAlertInstanceLocation.class;
    }

    @Override
    protected String fixture() {
        return "webhook-alert-instance-location.json";
    }

    @Override
    protected String schema() {
        return "webhook-alert-instance-location-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookAlertInstanceLocation();
    }
}
