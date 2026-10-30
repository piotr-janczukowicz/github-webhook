package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationTargetRenamedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationTargetRenamedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-target-renamed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-target-renamed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedEvent();
    }
}
