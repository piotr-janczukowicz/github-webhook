package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestStackBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestStackBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-stack-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-stack-base-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPullRequestStackBase();
    }
}
