package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLabelEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLabelEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-label-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-label-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return LabelCatalogFixtures.webhookLabelEditedEvent();
    }
}
