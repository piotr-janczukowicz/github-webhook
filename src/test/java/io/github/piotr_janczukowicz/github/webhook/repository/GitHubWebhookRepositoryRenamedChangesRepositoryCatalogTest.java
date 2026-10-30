package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRenamedChangesRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRenamedChangesRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-renamed-changes-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-renamed-changes-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookRepositoryRenamedChangesRepository();
    }
}
