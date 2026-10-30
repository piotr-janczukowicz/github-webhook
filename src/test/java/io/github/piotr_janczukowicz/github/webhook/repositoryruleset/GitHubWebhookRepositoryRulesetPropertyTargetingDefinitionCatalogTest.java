package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetPropertyTargetingDefinitionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetPropertyTargetingDefinition.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-property-targeting-definition.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-property-targeting-definition-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetPropertyTargetingDefinition();
    }
}
