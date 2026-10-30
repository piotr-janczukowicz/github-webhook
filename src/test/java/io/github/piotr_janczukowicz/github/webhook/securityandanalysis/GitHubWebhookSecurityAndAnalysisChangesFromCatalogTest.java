package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAndAnalysisChangesFromCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAndAnalysisChangesFrom.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-and-analysis-changes-from.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-and-analysis-changes-from-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAndAnalysisCatalogFixtures.webhookSecurityAndAnalysisChangesFrom();
    }
}
