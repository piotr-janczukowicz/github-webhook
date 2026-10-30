package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationRepositoriesAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationRepositoriesAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-repositories-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-repositories-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesAddedEvent();
    }
}
