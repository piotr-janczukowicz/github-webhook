package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequestBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-base-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookSimplePullRequestBase();
    }
}
