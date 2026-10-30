package io.github.piotr_janczukowicz.github.webhook.ping;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPingHookNameCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPingHookName.class;
    }

    @Override
    protected String schema() {
        return "webhook-ping-hook-name-schema.json";
    }
}
