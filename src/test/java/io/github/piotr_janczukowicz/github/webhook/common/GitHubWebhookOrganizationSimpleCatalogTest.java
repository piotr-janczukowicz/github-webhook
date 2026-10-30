package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationSimpleCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationSimple.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-simple.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-simple-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookOrganizationSimple();
    }
}
