package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-full-repository-security-and-analysis-advanced-security-status-schema.json";
    }
}
