package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunRequestedActionEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunRequestedActionEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-requested-action-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-requested-action-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCheckRunRequestedActionEvent();
    }
}
