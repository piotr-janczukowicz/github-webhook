package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertUnassignedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertUnassignedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-unassigned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-unassigned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertUnassignedEvent();
    }
}
