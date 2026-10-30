package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMergeQueueTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeQueueType.class;
    }

    @Override
    protected String schema() {
        return "webhook-merge-queue-type-schema.json";
    }
}
