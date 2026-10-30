package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMergeQueueParametersGroupingStrategyCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeQueueParametersGroupingStrategy.class;
    }

    @Override
    protected String schema() {
        return "webhook-merge-queue-parameters-grouping-strategy-schema.json";
    }
}
