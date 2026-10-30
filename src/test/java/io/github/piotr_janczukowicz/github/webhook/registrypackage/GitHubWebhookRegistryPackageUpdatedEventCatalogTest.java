package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackageUpdatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackageUpdatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-updated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-updated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedEvent();
    }
}
