package io.github.piotr_janczukowicz.github.webhook.installation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationSuspendEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationSuspendEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-suspend-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-suspend-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationCatalogFixtures.webhookInstallationSuspendEvent();
    }
}
