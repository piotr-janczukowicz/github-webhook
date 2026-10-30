package io.github.piotr_janczukowicz.github.webhook.meta;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMetaDeletedHookConfigCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMetaDeletedHookConfig.class;
    }

    @Override
    protected String fixture() {
        return "webhook-meta-deleted-hook-config.json";
    }

    @Override
    protected String schema() {
        return "webhook-meta-deleted-hook-config-schema.json";
    }

    @Override
    protected Object expected() {
        return MetaCatalogFixtures.webhookMetaDeletedHookConfig();
    }
}
