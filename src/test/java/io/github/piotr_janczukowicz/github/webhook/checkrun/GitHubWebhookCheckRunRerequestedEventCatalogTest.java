package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunRerequestedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunRerequestedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-rerequested-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-rerequested-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCheckRunRerequestedEvent();
    }
}
