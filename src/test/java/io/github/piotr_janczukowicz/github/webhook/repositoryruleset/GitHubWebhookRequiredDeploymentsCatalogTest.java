package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRequiredDeploymentsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredDeployments.class;
    }

    @Override
    protected String fixture() {
        return "webhook-required-deployments.json";
    }

    @Override
    protected String schema() {
        return "webhook-required-deployments-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRequiredDeployments();
    }
}
