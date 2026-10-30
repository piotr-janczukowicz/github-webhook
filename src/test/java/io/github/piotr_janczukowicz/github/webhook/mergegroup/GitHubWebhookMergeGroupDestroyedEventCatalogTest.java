package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMergeGroupDestroyedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeGroupDestroyedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-merge-group-destroyed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-merge-group-destroyed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MergeGroupCatalogFixtures.webhookMergeGroupDestroyedEvent();
    }
}
