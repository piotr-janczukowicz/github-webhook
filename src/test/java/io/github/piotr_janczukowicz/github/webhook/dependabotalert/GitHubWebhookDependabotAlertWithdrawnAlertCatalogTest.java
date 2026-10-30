package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertWithdrawnAlertCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertWithdrawnAlert.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-withdrawn-alert.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-withdrawn-alert-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlert();
    }
}
