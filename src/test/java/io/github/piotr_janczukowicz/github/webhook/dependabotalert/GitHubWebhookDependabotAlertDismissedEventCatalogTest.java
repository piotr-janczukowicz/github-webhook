package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertDismissedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertDismissedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-dismissed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-dismissed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertDismissedEvent();
    }
}
