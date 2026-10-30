package io.github.piotr_janczukowicz.github.webhook.installation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationUnsuspendEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationUnsuspendEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-unsuspend-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-unsuspend-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationCatalogFixtures.webhookInstallationUnsuspendEvent();
    }
}
