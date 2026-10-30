package io.github.piotr_janczukowicz.github.webhook.installation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationCatalogFixtures.webhookInstallationCreatedEvent();
    }
}
