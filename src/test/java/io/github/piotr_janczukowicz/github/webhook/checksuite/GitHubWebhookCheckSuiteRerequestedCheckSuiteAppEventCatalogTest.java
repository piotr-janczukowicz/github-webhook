package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRerequestedCheckSuiteAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-rerequested-check-suite-app-event-schema.json";
    }
}
