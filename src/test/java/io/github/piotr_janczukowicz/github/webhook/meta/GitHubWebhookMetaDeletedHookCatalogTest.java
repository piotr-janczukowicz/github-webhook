package io.github.piotr_janczukowicz.github.webhook.meta;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMetaDeletedHookCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMetaDeletedHook.class;
    }

    @Override
    protected String fixture() {
        return "webhook-meta-deleted-hook.json";
    }

    @Override
    protected String schema() {
        return "webhook-meta-deleted-hook-schema.json";
    }

    @Override
    protected Object expected() {
        return MetaCatalogFixtures.webhookMetaDeletedHook();
    }
}
