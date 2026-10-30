package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLicenseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLicense.class;
    }

    @Override
    protected String fixture() {
        return "webhook-license.json";
    }

    @Override
    protected String schema() {
        return "webhook-license-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookLicense();
    }
}
