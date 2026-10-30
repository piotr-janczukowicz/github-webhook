package io.github.piotr_janczukowicz.github.webhook.pagebuild;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPageBuildValueErrorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPageBuildValueError.class;
    }

    @Override
    protected String fixture() {
        return "webhook-page-build-value-error.json";
    }

    @Override
    protected String schema() {
        return "webhook-page-build-value-error-schema.json";
    }

    @Override
    protected Object expected() {
        return PageBuildCatalogFixtures.webhookPageBuildValueError();
    }
}
