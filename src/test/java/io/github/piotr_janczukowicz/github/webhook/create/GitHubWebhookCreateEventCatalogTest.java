package io.github.piotr_janczukowicz.github.webhook.create;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCreateEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCreateEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-create-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-create-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CreateCatalogFixtures.webhookCreateEvent();
    }
}
