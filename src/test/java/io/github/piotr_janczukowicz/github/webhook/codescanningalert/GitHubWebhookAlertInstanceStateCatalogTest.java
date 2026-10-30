package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookAlertInstanceStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAlertInstanceState.class;
    }

    @Override
    protected String schema() {
        return "webhook-alert-instance-state-schema.json";
    }
}
