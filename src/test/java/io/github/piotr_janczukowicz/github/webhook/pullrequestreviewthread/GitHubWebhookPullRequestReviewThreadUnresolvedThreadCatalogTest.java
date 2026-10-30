package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewThreadUnresolvedThreadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewThreadUnresolvedThread.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-thread-unresolved-thread.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-thread-unresolved-thread-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedThread();
    }
}
