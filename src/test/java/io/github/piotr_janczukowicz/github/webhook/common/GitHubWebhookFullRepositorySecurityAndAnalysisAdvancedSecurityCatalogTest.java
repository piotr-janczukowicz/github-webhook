package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity.class;
    }

    @Override
    protected String fixture() {
        return "webhook-full-repository-security-and-analysis-advanced-security.json";
    }

    @Override
    protected String schema() {
        return "webhook-full-repository-security-and-analysis-advanced-security-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookFullRepositorySecurityAndAnalysisAdvancedSecurity();
    }
}
