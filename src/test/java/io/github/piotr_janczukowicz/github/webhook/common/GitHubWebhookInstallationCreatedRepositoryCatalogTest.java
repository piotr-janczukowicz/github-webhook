package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationCreatedRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationCreatedRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-created-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-created-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookInstallationCreatedRepository();
    }
}
