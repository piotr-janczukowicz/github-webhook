package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-repository-advisory-state-schema.json";
    }
}
