package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertState.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-state-schema.json";
    }
}
