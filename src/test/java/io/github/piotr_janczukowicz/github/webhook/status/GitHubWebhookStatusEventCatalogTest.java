package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-event-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusEvent();
    }
}
