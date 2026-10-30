package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryUnarchivedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryUnarchivedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-unarchived-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-unarchived-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryUnarchivedEvent();
    }
}
