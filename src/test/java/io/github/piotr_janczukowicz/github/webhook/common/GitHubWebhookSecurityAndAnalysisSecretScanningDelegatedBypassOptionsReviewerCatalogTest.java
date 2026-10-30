package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewer.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-and-analysis-secret-scanning-delegated-bypass-options-reviewer.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-and-analysis-secret-scanning-delegated-bypass-options-reviewer-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewer();
    }
}
