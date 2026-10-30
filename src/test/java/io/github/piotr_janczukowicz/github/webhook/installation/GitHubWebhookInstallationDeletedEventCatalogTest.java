package io.github.piotr_janczukowicz.github.webhook.installation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationCatalogFixtures.webhookInstallationDeletedEvent();
    }
}
