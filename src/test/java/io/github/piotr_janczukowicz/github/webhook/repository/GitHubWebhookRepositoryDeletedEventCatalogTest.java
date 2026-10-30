package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryDeletedEvent();
    }
}
