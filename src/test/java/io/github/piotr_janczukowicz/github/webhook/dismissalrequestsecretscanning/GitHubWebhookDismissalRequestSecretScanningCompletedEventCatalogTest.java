package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestSecretScanningCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestSecretScanningCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-secret-scanning-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-secret-scanning-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestSecretScanningCatalogFixtures.webhookDismissalRequestSecretScanningCompletedEvent();
    }
}
