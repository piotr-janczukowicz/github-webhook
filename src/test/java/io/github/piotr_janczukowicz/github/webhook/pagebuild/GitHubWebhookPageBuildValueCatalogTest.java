package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPageBuildValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPageBuildValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-page-build-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-page-build-value-schema.json";
    }

    @Override
    protected Object expected() {
        return PageBuildCatalogFixtures.webhookPageBuildValue();
    }
}
