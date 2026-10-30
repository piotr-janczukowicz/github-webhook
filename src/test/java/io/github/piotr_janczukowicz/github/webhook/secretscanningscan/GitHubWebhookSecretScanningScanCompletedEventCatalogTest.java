package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningScanCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningScanCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-scan-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-scan-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningScanCatalogFixtures.webhookSecretScanningScanCompletedEvent();
    }
}
