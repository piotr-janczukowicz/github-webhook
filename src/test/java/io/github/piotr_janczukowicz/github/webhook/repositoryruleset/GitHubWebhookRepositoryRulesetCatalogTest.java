package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRuleset.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRuleset();
    }
}
