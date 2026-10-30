package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBypassRequestSecretScanningResponseSubmittedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-bypass-request-secret-scanning-response-submitted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-bypass-request-secret-scanning-response-submitted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BypassRequestSecretScanningCatalogFixtures.webhookBypassRequestSecretScanningResponseSubmittedEvent();
    }
}
