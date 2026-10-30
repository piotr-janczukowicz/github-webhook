package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMaxFilePathLengthTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMaxFilePathLengthType.class;
    }

    @Override
    protected String schema() {
        return "webhook-max-file-path-length-type-schema.json";
    }
}
