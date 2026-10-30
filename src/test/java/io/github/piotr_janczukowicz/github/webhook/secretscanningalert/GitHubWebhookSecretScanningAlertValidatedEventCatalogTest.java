package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertValidatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertValidatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-validated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-validated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertValidatedEvent();
    }
}
