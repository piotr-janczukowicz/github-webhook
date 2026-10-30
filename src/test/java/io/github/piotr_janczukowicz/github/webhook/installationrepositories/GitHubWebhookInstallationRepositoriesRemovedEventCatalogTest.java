package io.github.piotr_janczukowicz.github.webhook.installationrepositories;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationRepositoriesRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationRepositoriesRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-repositories-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-repositories-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationRepositoriesCatalogFixtures.webhookInstallationRepositoriesRemovedEvent();
    }
}
