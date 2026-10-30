package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestSecretScanningCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestSecretScanningCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-secret-scanning-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-secret-scanning-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestSecretScanningCatalogFixtures.webhookDismissalRequestSecretScanningCancelledEvent();
    }
}
