package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLabelUnarchivedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLabelUnarchivedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-label-unarchived-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-label-unarchived-event-schema.json";
    }

    @Override
    protected Object expected() {
        return LabelCatalogFixtures.webhookLabelUnarchivedEvent();
    }
}
