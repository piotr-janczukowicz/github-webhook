package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookAutoMergeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAutoMerge.class;
    }

    @Override
    protected String fixture() {
        return "webhook-auto-merge.json";
    }

    @Override
    protected String schema() {
        return "webhook-auto-merge-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookAutoMerge();
    }
}
