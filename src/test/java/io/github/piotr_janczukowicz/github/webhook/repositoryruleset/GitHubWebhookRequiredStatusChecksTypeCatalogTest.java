package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRequiredStatusChecksTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredStatusChecksType.class;
    }

    @Override
    protected String schema() {
        return "webhook-required-status-checks-type-schema.json";
    }
}
