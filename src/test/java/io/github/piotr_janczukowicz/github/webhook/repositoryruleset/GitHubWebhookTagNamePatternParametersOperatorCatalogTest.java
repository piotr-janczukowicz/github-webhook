package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookTagNamePatternParametersOperatorCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTagNamePatternParametersOperator.class;
    }

    @Override
    protected String schema() {
        return "webhook-tag-name-pattern-parameters-operator-schema.json";
    }
}
