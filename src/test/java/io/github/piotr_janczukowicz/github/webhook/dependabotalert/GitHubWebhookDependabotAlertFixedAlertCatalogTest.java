package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-fixed-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlert();
    }
}
