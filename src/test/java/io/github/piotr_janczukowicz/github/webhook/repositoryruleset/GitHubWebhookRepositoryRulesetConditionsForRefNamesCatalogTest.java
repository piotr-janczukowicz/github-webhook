package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetConditionsForRefNamesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetConditionsForRefNames.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-conditions-for-ref-names.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-conditions-for-ref-names-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetConditionsForRefNames();
    }
}
