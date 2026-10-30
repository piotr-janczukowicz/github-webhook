package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryPublicizedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryPublicizedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-publicized-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-publicized-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryPublicizedEvent();
    }
}
