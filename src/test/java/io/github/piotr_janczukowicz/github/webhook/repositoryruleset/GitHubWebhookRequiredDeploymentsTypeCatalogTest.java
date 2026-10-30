package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRequiredDeploymentsTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredDeploymentsType.class;
    }

    @Override
    protected String schema() {
        return "webhook-required-deployments-type-schema.json";
    }
}
