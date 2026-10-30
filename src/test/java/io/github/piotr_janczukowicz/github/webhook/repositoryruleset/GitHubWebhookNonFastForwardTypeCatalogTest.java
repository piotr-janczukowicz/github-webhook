package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookNonFastForwardTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookNonFastForwardType.class;
    }

    @Override
    protected String schema() {
        return "webhook-non-fast-forward-type-schema.json";
    }
}
