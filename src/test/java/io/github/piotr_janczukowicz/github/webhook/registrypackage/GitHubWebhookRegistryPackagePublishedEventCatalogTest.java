package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackagePublishedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackagePublishedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-published-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-published-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedEvent();
    }
}
