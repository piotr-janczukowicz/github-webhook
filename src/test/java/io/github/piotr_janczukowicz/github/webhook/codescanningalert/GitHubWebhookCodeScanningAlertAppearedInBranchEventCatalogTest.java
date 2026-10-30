package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertAppearedInBranchEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertAppearedInBranchEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-appeared-in-branch-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-appeared-in-branch-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchEvent();
    }
}
