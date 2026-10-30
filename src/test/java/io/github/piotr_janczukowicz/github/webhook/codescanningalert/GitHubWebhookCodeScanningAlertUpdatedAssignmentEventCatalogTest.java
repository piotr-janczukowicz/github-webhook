package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertUpdatedAssignmentEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertUpdatedAssignmentEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-updated-assignment-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-updated-assignment-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertUpdatedAssignmentEvent();
    }
}
