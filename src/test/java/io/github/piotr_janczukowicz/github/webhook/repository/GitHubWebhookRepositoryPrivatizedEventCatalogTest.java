package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryPrivatizedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryPrivatizedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-privatized-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-privatized-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryPrivatizedEvent();
    }
}
