package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertMetadataCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertMetadataCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-metadata-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-metadata-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertMetadataCreatedEvent();
    }
}
