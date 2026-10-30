package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCheckRunCompletedEvent();
    }
}
