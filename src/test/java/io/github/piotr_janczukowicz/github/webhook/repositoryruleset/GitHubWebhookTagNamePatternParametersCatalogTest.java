package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTagNamePatternParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTagNamePatternParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-tag-name-pattern-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-tag-name-pattern-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookTagNamePatternParameters();
    }
}
