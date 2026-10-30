package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-base-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPullRequestBase();
    }
}
