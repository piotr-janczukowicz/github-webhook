package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMaxFileSizeParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMaxFileSizeParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-max-file-size-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-max-file-size-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookMaxFileSizeParameters();
    }
}
