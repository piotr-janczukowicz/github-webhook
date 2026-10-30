package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseUnpublishedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseUnpublishedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-unpublished-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-unpublished-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseUnpublishedEvent();
    }
}
