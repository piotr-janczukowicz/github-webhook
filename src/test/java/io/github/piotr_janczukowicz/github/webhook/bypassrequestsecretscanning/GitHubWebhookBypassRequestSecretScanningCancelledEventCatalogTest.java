package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBypassRequestSecretScanningCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBypassRequestSecretScanningCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-bypass-request-secret-scanning-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-bypass-request-secret-scanning-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BypassRequestSecretScanningCatalogFixtures.webhookBypassRequestSecretScanningCancelledEvent();
    }
}
