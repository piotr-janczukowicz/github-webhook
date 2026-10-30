package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageUpdatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageUpdatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-updated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-updated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackageUpdatedEvent();
    }
}
