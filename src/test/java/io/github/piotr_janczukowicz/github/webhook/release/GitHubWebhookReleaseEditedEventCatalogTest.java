package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseEditedEvent();
    }
}
