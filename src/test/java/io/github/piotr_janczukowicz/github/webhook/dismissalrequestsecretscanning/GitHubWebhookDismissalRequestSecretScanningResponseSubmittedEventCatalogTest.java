package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestSecretScanningResponseSubmittedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestSecretScanningResponseSubmittedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-secret-scanning-response-submitted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-secret-scanning-response-submitted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestSecretScanningCatalogFixtures
                .webhookDismissalRequestSecretScanningResponseSubmittedEvent();
    }
}
