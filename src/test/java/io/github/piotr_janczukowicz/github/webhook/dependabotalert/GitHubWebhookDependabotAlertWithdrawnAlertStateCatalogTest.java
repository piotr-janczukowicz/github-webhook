package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertWithdrawnAlertStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertWithdrawnAlertState.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-withdrawn-alert-state-schema.json";
    }
}
