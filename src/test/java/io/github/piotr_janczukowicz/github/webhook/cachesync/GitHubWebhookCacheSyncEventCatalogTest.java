package io.github.piotr_janczukowicz.github.webhook.cachesync;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCacheSyncEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCacheSyncEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-cache-sync-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-cache-sync-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CacheSyncCatalogFixtures.webhookCacheSyncEvent();
    }
}
