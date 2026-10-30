package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestHeadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequestHead.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request-head.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-head-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestHead();
    }
}
