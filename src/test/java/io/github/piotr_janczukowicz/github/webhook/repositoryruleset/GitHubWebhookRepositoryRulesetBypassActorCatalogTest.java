package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetBypassActorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetBypassActor.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-bypass-actor.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-bypass-actor-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetBypassActor();
    }
}
