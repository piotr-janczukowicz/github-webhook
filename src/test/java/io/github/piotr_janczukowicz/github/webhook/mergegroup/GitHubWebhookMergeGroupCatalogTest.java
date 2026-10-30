package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMergeGroupCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeGroup.class;
    }

    @Override
    protected String fixture() {
        return "webhook-merge-group.json";
    }

    @Override
    protected String schema() {
        return "webhook-merge-group-schema.json";
    }

    @Override
    protected Object expected() {
        return MergeGroupCatalogFixtures.webhookMergeGroup();
    }
}
