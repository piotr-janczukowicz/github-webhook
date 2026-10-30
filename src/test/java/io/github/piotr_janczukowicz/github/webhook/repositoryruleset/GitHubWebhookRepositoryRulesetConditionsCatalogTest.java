package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetConditionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetConditions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-conditions.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-conditions-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditions();
    }
}
