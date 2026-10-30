package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeQualityParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeQualityParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-quality-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-quality-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCodeQualityParameters();
    }
}
