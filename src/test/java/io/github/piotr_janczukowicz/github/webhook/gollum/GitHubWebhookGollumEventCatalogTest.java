package io.github.piotr_janczukowicz.github.webhook.gollum;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookGollumEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookGollumEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-gollum-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-gollum-event-schema.json";
    }

    @Override
    protected Object expected() {
        return GollumCatalogFixtures.webhookGollumEvent();
    }
}
