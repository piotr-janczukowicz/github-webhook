package io.github.piotr_janczukowicz.github.webhook.repositoryimport;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryImportEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryImportEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-import-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-import-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryImportCatalogFixtures.webhookRepositoryImportEvent();
    }
}
