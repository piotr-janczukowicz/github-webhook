package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetConditionsRepositoryIdCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetConditionsRepositoryId.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-conditions-repository-id.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-conditions-repository-id-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsRepositoryId();
    }
}
