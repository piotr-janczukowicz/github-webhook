package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewThreadUnresolvedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewThreadUnresolvedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-thread-unresolved-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-thread-unresolved-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedPullRequest();
    }
}
