package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertFixedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-fixed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertFixedEvent();
    }
}
