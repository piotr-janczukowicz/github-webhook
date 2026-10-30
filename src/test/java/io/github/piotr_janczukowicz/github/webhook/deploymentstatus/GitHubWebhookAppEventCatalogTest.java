package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-app-event-schema.json";
    }
}
