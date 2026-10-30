package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertAutoReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertAutoReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-auto-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-auto-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertAutoReopenedEvent();
    }
}
