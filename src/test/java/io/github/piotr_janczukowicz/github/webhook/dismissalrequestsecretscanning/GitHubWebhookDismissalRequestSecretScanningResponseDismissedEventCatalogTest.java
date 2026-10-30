package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestSecretScanningResponseDismissedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-secret-scanning-response-dismissed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-secret-scanning-response-dismissed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestSecretScanningCatalogFixtures
                .webhookDismissalRequestSecretScanningResponseDismissedEvent();
    }
}
