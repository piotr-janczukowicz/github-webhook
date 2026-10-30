package io.github.piotr_janczukowicz.github.webhook.ping;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookHookResponseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookHookResponse.class;
    }

    @Override
    protected String fixture() {
        return "webhook-hook-response.json";
    }

    @Override
    protected String schema() {
        return "webhook-hook-response-schema.json";
    }

    @Override
    protected Object expected() {
        return PingCatalogFixtures.webhookHookResponse();
    }
}
