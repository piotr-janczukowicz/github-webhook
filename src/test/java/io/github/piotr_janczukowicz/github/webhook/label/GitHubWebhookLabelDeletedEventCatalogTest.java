package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLabelDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLabelDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-label-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-label-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return LabelCatalogFixtures.webhookLabelDeletedEvent();
    }
}
