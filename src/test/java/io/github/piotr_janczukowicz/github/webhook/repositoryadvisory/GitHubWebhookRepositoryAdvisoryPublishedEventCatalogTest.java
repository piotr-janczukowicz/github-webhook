package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAdvisoryPublishedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAdvisoryPublishedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-advisory-published-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-advisory-published-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookRepositoryAdvisoryPublishedEvent();
    }
}
