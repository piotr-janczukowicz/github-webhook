package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseCreatedEvent();
    }
}
