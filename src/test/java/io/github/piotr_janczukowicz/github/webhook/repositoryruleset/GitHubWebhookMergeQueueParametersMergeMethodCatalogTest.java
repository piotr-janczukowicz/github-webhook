package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMergeQueueParametersMergeMethodCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeQueueParametersMergeMethod.class;
    }

    @Override
    protected String schema() {
        return "webhook-merge-queue-parameters-merge-method-schema.json";
    }
}
