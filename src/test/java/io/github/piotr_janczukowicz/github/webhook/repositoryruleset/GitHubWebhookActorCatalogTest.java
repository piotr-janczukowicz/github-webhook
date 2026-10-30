package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookActorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookActor.class;
    }

    @Override
    protected String fixture() {
        return "webhook-actor.json";
    }

    @Override
    protected String schema() {
        return "webhook-actor-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookActor();
    }
}
