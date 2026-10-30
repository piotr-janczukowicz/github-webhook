package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertMetadataRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertMetadataRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-metadata-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-metadata-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertMetadataRemovedEvent();
    }
}
