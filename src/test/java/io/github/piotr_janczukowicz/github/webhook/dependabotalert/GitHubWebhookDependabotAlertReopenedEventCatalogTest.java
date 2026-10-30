package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertReopenedEvent();
    }
}
