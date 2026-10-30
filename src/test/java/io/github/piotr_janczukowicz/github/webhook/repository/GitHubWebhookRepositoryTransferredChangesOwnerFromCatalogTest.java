package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryTransferredChangesOwnerFromCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryTransferredChangesOwnerFrom.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-transferred-changes-owner-from.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-transferred-changes-owner-from-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryTransferredChangesOwnerFrom();
    }
}
