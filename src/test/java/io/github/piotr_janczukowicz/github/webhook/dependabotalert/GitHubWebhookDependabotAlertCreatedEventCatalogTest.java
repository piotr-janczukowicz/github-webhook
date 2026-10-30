package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertCreatedEvent();
    }
}
