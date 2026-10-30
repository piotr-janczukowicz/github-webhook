package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewThreadResolvedThreadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewThreadResolvedThread.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-thread-resolved-thread.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-thread-resolved-thread-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadResolvedThread();
    }
}
