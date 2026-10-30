package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertAutoDismissedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertAutoDismissedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-auto-dismissed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-auto-dismissed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertAutoDismissedEvent();
    }
}
