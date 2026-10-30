package io.github.piotr_janczukowicz.github.webhook.meta;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMetaDeletedHookConfigContentTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMetaDeletedHookConfigContentType.class;
    }

    @Override
    protected String schema() {
        return "webhook-meta-deleted-hook-config-content-type-schema.json";
    }
}
