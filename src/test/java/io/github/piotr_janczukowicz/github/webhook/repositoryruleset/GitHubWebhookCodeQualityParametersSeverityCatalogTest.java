package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCodeQualityParametersSeverityCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeQualityParametersSeverity.class;
    }

    @Override
    protected String schema() {
        return "webhook-code-quality-parameters-severity-schema.json";
    }
}
