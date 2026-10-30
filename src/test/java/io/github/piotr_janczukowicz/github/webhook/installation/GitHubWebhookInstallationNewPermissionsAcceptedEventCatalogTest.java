package io.github.piotr_janczukowicz.github.webhook.installation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationNewPermissionsAcceptedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationNewPermissionsAcceptedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-new-permissions-accepted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-new-permissions-accepted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationCatalogFixtures.webhookInstallationNewPermissionsAcceptedEvent();
    }
}
