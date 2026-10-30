package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLicenseSimpleCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLicenseSimple.class;
    }

    @Override
    protected String fixture() {
        return "webhook-license-simple.json";
    }

    @Override
    protected String schema() {
        return "webhook-license-simple-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookLicenseSimple();
    }
}
