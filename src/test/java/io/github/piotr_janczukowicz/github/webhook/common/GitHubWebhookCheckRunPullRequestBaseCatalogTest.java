package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunPullRequestBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunPullRequestBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-pull-request-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-pull-request-base-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookCheckRunPullRequestBase();
    }
}
