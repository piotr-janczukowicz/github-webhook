package io.github.piotr_janczukowicz.github.webhook.publicevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPublicEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPublicEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-public-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-public-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PublicCatalogFixtures.webhookPublicEvent();
    }
}
