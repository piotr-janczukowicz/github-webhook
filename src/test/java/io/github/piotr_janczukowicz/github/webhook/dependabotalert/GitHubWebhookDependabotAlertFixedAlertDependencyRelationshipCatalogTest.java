package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertDependencyRelationshipCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-dependency-relationship-schema.json";
    }
}
