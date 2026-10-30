package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertDependencyCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertDependency.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-fixed-alert-dependency.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-dependency-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertDependency();
    }
}
