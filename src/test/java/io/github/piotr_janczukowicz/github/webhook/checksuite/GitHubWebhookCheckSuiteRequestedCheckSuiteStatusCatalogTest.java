package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckSuiteRequestedCheckSuiteStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-requested-check-suite-status-schema.json";
    }
}
