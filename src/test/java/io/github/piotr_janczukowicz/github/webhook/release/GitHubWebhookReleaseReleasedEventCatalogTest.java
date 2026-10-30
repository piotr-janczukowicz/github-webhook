package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseReleasedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseReleasedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-released-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-released-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseReleasedEvent();
    }
}
