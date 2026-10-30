package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertWithdrawnEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertWithdrawnEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-withdrawn-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-withdrawn-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnEvent();
    }
}
