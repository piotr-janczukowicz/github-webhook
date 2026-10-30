package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAnonymousAccessEnabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAnonymousAccessEnabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-anonymous-access-enabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-anonymous-access-enabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryAnonymousAccessEnabledEvent();
    }
}
