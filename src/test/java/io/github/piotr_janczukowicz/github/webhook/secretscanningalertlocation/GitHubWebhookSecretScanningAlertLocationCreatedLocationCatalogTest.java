package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertLocationCreatedLocationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocation.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-location-created-location.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-location-created-location-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures.webhookSecretScanningAlertLocationCreatedLocation();
    }
}
