package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAndAnalysisChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAndAnalysisChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-and-analysis-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-and-analysis-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAndAnalysisCatalogFixtures.webhookSecurityAndAnalysisChanges();
    }
}
