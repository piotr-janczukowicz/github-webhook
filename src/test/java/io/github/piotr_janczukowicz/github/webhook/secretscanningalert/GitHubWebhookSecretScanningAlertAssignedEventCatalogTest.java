package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertAssignedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertAssignedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-assigned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-assigned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertAssignedEvent();
    }
}
