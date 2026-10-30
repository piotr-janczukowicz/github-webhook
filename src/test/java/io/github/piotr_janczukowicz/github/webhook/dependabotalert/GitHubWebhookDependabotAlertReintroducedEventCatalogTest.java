package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertReintroducedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertReintroducedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-reintroduced-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-reintroduced-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertReintroducedEvent();
    }
}
