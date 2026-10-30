package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetConditionsRepositoryNameCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetConditionsRepositoryName.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-conditions-repository-name.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-conditions-repository-name-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsRepositoryName();
    }
}
