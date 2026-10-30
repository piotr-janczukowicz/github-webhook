package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryCodeSearchIndexStatusCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryCodeSearchIndexStatus.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-code-search-index-status.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-code-search-index-status-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRepositoryCodeSearchIndexStatus();
    }
}
