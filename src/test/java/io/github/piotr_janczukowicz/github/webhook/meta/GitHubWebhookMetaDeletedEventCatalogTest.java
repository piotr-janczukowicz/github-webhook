package io.github.piotr_janczukowicz.github.webhook.meta;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMetaDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMetaDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-meta-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-meta-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MetaCatalogFixtures.webhookMetaDeletedEvent();
    }
}
