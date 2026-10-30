package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMergeGroupChecksRequestedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeGroupChecksRequestedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-merge-group-checks-requested-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-merge-group-checks-requested-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MergeGroupCatalogFixtures.webhookMergeGroupChecksRequestedEvent();
    }
}
