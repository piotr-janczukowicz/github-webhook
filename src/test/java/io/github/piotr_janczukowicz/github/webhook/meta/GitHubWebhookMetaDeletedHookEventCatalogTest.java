package io.github.piotr_janczukowicz.github.webhook.meta;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMetaDeletedHookEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMetaDeletedHookEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-meta-deleted-hook-event-schema.json";
    }
}
