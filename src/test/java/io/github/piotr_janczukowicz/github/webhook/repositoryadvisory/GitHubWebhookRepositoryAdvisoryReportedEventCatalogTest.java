package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAdvisoryReportedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryReportedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-advisory-reported-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-reported-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryReportedEvent();
    }
}
