package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedEvent();
    }
}
