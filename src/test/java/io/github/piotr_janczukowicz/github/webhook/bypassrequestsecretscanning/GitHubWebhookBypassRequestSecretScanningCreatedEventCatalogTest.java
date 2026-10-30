package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBypassRequestSecretScanningCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBypassRequestSecretScanningCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-bypass-request-secret-scanning-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-bypass-request-secret-scanning-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BypassRequestSecretScanningCatalogFixtures.webhookBypassRequestSecretScanningCreatedEvent();
    }
}
