package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryArchivedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryArchivedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-archived-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-archived-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryArchivedEvent();
    }
}
