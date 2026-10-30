package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-alert-appeared-in-branch-alert-dismissed-reason-schema.json";
    }
}
