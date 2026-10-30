package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertWithdrawnAlertDependencyCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertWithdrawnAlertDependency.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-withdrawn-alert-dependency.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-withdrawn-alert-dependency-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlertDependency();
    }
}
