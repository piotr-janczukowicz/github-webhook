package io.github.piotr_janczukowicz.github.webhook.ping;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPingEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPingEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-ping-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-ping-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PingCatalogFixtures.webhookPingEvent();
    }
}
