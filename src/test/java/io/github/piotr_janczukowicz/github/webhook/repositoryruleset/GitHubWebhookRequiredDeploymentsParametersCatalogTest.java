package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRequiredDeploymentsParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredDeploymentsParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-required-deployments-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-required-deployments-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRequiredDeploymentsParameters();
    }
}
