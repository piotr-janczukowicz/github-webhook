package io.github.piotr_janczukowicz.github.webhook.ping;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPingHookCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPingHook.class;
    }

    @Override
    protected String fixture() {
        return "webhook-ping-hook.json";
    }

    @Override
    protected String schema() {
        return "webhook-ping-hook-schema.json";
    }

    @Override
    protected Object expected() {
        return PingCatalogFixtures.webhookPingHook();
    }
}
