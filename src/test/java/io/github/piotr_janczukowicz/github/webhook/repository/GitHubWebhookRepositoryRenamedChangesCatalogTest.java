package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRenamedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRenamedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-renamed-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-renamed-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryRenamedChanges();
    }
}
