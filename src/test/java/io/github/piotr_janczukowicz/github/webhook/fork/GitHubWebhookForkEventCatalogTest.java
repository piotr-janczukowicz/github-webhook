package io.github.piotr_janczukowicz.github.webhook.fork;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookForkEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookForkEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-fork-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-fork-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ForkCatalogFixtures.webhookForkEvent();
    }
}
