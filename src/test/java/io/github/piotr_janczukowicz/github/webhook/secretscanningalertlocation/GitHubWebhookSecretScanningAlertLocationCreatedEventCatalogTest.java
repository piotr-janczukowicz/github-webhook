package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertLocationCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertLocationCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-location-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-location-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures.webhookSecretScanningAlertLocationCreatedEvent();
    }
}
