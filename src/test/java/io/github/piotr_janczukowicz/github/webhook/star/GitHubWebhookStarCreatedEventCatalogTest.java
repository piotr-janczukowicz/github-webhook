package io.github.piotr_janczukowicz.github.webhook.star;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStarCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStarCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-star-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-star-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return StarCatalogFixtures.webhookStarCreatedEvent();
    }
}
