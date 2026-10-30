package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryRulesetEnforcementCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEnforcement.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-enforcement-schema.json";
    }
}
