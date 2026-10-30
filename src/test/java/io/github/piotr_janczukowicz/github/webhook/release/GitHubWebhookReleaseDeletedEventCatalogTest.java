package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseDeletedEvent();
    }
}
