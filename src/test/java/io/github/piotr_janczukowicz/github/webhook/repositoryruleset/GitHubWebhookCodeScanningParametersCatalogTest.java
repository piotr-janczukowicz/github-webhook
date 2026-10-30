package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCodeScanningParameters();
    }
}
