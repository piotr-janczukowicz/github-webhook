package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertDependencyScopeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertDependencyScope.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-dependency-scope-schema.json";
    }
}
