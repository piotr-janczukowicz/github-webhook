package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryRulesetBypassActorActorTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetBypassActorActorType.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-bypass-actor-actor-type-schema.json";
    }
}
