package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMerge.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-thread-unresolved-pull-request-auto-merge.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-thread-unresolved-pull-request-auto-merge-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedPullRequestAutoMerge();
    }
}
