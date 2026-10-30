package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryEditedEvent();
    }
}
