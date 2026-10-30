package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCreateRefTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCreateRefType.class;
    }

    @Override
    protected String schema() {
        return "webhook-create-ref-type-schema.json";
    }
}
