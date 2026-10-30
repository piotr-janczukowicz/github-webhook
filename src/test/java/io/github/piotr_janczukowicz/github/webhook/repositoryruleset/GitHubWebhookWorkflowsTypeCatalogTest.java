package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowsTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowsType.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflows-type-schema.json";
    }
}
