package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-repository-advisory-credit-type-schema.json";
    }
}
