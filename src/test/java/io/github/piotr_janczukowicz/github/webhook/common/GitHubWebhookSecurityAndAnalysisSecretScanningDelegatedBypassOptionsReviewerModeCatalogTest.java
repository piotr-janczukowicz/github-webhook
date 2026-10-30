package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerModeCatalogTest
        extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode.class;
    }

    @Override
    protected String schema() {
        return "webhook-security-and-analysis-secret-scanning-delegated-bypass-options-reviewer-mode-schema.json";
    }
}
