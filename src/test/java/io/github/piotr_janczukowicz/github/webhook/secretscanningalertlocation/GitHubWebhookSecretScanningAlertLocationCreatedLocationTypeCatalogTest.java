package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningAlertLocationCreatedLocationTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationType.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-location-created-location-type-schema.json";
    }
}
