package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryTransferredChangesOwnerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryTransferredChangesOwner.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-transferred-changes-owner.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-transferred-changes-owner-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryTransferredChangesOwner();
    }
}
