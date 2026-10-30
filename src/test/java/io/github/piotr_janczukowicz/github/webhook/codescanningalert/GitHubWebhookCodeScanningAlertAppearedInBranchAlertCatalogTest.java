package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningAlertAppearedInBranchAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertAppearedInBranchAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-alert-appeared-in-branch-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-appeared-in-branch-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookCodeScanningAlertAppearedInBranchAlert();
    }
}
