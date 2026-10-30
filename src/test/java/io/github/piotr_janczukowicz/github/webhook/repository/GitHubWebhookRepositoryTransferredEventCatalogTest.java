package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryTransferredEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryTransferredEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-transferred-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-transferred-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryTransferredEvent();
    }
}
