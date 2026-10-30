package io.github.piotr_janczukowicz.github.webhook.ping;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPingHookConfigCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPingHookConfig.class;
    }

    @Override
    protected String fixture() {
        return "webhook-ping-hook-config.json";
    }

    @Override
    protected String schema() {
        return "webhook-ping-hook-config-schema.json";
    }

    @Override
    protected Object expected() {
        return PingCatalogFixtures.webhookPingHookConfig();
    }
}
