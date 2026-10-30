package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookUpdateParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookUpdateParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-update-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-update-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookUpdateParameters();
    }
}
