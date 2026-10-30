package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteRequestedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRequestedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-requested-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-requested-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedEvent();
    }
}
