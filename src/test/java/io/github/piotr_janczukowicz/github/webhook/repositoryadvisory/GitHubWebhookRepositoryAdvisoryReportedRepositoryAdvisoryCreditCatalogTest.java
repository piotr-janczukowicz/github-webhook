package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-advisory-reported-repository-advisory-credit.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-repository-advisory-credit-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisoryCredit();
    }
}
