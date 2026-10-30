package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeCoverageParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeCoverageParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-coverage-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-coverage-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCodeCoverageParameters();
    }
}
