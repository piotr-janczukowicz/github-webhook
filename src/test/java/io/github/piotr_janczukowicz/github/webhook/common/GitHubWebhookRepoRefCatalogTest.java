package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepoRefCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepoRef.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repo-ref.json";
    }

    @Override
    protected String schema() {
        return "webhook-repo-ref-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRepoRef();
    }
}
