package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRequiredLinearHistoryTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredLinearHistoryType.class;
    }

    @Override
    protected String schema() {
        return "webhook-required-linear-history-type-schema.json";
    }
}
