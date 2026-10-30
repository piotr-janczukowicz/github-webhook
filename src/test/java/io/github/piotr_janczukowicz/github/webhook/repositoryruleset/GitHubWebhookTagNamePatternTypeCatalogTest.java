package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookTagNamePatternTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTagNamePatternType.class;
    }

    @Override
    protected String schema() {
        return "webhook-tag-name-pattern-type-schema.json";
    }
}
