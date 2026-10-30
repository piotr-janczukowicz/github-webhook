package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMergeGroupDestroyedReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeGroupDestroyedReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-merge-group-destroyed-reason-schema.json";
    }
}
