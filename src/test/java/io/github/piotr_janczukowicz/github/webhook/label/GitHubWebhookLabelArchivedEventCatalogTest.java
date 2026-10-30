package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLabelArchivedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLabelArchivedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-label-archived-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-label-archived-event-schema.json";
    }

    @Override
    protected Object expected() {
        return LabelCatalogFixtures.webhookLabelArchivedEvent();
    }
}
