package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-advisory-reported-repository-advisory.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-repository-advisory-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisory();
    }
}
