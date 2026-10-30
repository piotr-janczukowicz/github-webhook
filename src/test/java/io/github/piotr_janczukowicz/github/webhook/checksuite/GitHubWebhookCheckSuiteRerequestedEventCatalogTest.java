package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteRerequestedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRerequestedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-rerequested-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-rerequested-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedEvent();
    }
}
