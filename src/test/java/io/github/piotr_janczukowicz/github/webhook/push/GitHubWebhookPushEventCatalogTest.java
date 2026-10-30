package io.github.piotr_janczukowicz.github.webhook.push;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPushEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPushEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-push-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-push-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PushCatalogFixtures.webhookPushEvent();
    }
}
