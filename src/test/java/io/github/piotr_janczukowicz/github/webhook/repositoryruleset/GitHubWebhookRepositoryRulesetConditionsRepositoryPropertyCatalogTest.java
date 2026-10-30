package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetConditionsRepositoryPropertyCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetConditionsRepositoryProperty.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-conditions-repository-property.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-conditions-repository-property-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsRepositoryProperty();
    }
}
