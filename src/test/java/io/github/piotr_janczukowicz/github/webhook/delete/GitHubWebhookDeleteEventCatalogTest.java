package io.github.piotr_janczukowicz.github.webhook.delete;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeleteEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeleteEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-delete-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-delete-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeleteCatalogFixtures.webhookDeleteEvent();
    }
}
