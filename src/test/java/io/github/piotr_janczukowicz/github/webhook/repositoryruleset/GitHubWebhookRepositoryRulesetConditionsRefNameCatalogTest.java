package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetConditionsRefNameCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetConditionsRefName.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-conditions-ref-name.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-conditions-ref-name-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsRefName();
    }
}
