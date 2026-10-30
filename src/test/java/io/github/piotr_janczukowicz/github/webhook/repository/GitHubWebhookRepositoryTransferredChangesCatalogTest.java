package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryTransferredChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryTransferredChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-transferred-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-transferred-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryTransferredChanges();
    }
}
