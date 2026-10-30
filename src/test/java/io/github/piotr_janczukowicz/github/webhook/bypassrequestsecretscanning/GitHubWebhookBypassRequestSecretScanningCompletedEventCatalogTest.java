package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBypassRequestSecretScanningCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBypassRequestSecretScanningCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-bypass-request-secret-scanning-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-bypass-request-secret-scanning-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BypassRequestSecretScanningCatalogFixtures.webhookBypassRequestSecretScanningCompletedEvent();
    }
}
