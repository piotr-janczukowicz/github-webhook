package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLabelCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLabelCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-label-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-label-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return LabelCatalogFixtures.webhookLabelCreatedEvent();
    }
}
