package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookFullRepositorySecurityAndAnalysisCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFullRepositorySecurityAndAnalysis.class;
    }

    @Override
    protected String fixture() {
        return "webhook-full-repository-security-and-analysis.json";
    }

    @Override
    protected String schema() {
        return "webhook-full-repository-security-and-analysis-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookFullRepositorySecurityAndAnalysis();
    }
}
