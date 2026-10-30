package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowsParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowsParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflows-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflows-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookWorkflowsParameters();
    }
}
