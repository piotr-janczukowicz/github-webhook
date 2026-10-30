package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookEnterpriseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookEnterprise.class;
    }

    @Override
    protected String fixture() {
        return "webhook-enterprise.json";
    }

    @Override
    protected String schema() {
        return "webhook-enterprise-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookEnterprise();
    }
}
