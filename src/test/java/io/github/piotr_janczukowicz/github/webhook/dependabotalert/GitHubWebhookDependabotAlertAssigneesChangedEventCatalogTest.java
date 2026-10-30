package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertAssigneesChangedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertAssigneesChangedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-assignees-changed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-assignees-changed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertAssigneesChangedEvent();
    }
}
