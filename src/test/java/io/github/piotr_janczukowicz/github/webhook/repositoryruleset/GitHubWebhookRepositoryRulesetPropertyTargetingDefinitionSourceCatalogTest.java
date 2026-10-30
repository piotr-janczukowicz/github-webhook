package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSourceCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionSource.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-property-targeting-definition-source-schema.json";
    }
}
