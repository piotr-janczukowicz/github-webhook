package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRenamedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRenamedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-renamed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-renamed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryRenamedEvent();
    }
}
