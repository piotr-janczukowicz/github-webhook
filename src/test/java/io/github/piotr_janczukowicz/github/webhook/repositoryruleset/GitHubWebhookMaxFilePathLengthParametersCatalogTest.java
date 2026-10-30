package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMaxFilePathLengthParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMaxFilePathLengthParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-max-file-path-length-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-max-file-path-length-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookMaxFilePathLengthParameters();
    }
}
