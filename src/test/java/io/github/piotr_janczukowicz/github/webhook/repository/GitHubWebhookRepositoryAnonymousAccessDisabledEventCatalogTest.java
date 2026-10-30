package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryAnonymousAccessDisabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryAnonymousAccessDisabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-anonymous-access-disabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-anonymous-access-disabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryAnonymousAccessDisabledEvent();
    }
}
