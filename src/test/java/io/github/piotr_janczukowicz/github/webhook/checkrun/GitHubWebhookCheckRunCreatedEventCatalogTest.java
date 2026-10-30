package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCheckRunCreatedEvent();
    }
}
