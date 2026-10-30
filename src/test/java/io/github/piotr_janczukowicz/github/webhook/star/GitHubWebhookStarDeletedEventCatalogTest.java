package io.github.piotr_janczukowicz.github.webhook.star;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStarDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStarDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-star-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-star-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return StarCatalogFixtures.webhookStarDeletedEvent();
    }
}
