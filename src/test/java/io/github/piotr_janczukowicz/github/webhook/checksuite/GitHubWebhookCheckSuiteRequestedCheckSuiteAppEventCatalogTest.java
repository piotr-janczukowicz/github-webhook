package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckSuiteRequestedCheckSuiteAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-requested-check-suite-app-event-schema.json";
    }
}
