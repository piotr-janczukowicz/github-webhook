package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRequiredSignaturesTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredSignaturesType.class;
    }

    @Override
    protected String schema() {
        return "webhook-required-signatures-type-schema.json";
    }
}
