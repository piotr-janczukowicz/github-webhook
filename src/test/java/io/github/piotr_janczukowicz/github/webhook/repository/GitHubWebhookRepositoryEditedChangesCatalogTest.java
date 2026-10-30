package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryEditedChanges();
    }
}
