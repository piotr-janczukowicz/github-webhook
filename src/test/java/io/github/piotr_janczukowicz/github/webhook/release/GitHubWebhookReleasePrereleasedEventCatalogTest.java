package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleasePrereleasedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleasePrereleasedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-prereleased-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-prereleased-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleasePrereleasedEvent();
    }
}
