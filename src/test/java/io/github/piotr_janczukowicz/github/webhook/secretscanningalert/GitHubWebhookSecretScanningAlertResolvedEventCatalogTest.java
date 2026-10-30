package io.github.piotr_janczukowicz.github.webhook.secretscanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertResolvedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertResolvedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-resolved-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-resolved-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertCatalogFixtures.webhookSecretScanningAlertResolvedEvent();
    }
}
