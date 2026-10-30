package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationRepositoriesAddedRepositoriesRemovedCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationRepositoriesAddedRepositoriesRemoved.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-repositories-added-repositories-removed.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-repositories-added-repositories-removed-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedRepositoriesRemoved();
    }
}
