package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBypassRequestSecretScanningResponseDismissedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBypassRequestSecretScanningResponseDismissedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-bypass-request-secret-scanning-response-dismissed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-bypass-request-secret-scanning-response-dismissed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BypassRequestSecretScanningCatalogFixtures.webhookBypassRequestSecretScanningResponseDismissedEvent();
    }
}
