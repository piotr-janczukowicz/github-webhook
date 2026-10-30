package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLinkCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLink.class;
    }

    @Override
    protected String fixture() {
        return "webhook-link.json";
    }

    @Override
    protected String schema() {
        return "webhook-link-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookLink();
    }
}
