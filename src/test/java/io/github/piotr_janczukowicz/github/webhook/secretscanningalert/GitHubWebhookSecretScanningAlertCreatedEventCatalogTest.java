package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertCreatedEvent();
    }
}
