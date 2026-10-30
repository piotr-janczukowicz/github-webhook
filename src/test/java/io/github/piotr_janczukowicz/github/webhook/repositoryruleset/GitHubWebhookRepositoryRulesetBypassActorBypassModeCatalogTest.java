package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryRulesetBypassActorBypassModeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetBypassActorBypassMode.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-bypass-actor-bypass-mode-schema.json";
    }
}
