package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckSuiteCompletedCheckSuiteStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteCompletedCheckSuiteStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-completed-check-suite-status-schema.json";
    }
}
