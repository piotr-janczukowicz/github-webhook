package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryRulesetSourceTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetSourceType.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-source-type-schema.json";
    }
}
