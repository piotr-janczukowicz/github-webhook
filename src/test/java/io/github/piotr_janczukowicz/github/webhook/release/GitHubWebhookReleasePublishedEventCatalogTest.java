package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleasePublishedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleasePublishedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-published-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-published-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleasePublishedEvent();
    }
}
