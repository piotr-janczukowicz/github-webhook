package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertReopenedEvent();
    }
}
