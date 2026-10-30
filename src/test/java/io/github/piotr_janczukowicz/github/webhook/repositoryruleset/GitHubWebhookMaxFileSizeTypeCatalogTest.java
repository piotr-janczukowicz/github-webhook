package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMaxFileSizeTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMaxFileSizeType.class;
    }

    @Override
    protected String schema() {
        return "webhook-max-file-size-type-schema.json";
    }
}
