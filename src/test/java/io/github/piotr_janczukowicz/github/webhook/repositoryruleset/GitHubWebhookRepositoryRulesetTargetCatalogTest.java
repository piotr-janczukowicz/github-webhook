package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryRulesetTargetCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetTarget.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-target-schema.json";
    }
}
