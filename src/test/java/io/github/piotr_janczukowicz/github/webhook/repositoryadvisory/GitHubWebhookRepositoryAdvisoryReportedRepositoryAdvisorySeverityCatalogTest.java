package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverityCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-repository-advisory-severity-schema.json";
    }
}
