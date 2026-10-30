package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailedCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-advisory-reported-repository-advisory-credits-detailed.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-repository-advisory-credits-detailed-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditsDetailed();
    }
}
