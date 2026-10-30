package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertPubliclyLeakedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertPubliclyLeakedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-publicly-leaked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-publicly-leaked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertPubliclyLeakedEvent();
    }
}
