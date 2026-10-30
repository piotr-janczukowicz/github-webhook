package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackagePublishedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackagePublishedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-published-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-published-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackagePublishedEvent();
    }
}
