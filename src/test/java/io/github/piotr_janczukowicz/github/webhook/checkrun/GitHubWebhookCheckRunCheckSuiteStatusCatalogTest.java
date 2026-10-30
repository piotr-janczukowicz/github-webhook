package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckRunCheckSuiteStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunCheckSuiteStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-run-check-suite-status-schema.json";
    }
}
