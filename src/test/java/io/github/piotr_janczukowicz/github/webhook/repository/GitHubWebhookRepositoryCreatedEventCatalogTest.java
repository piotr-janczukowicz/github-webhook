package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryCreatedEvent();
    }
}
