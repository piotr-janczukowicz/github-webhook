package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewSubmittedPullRequestHeadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewSubmittedPullRequestHead.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-submitted-pull-request-head.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-submitted-pull-request-head-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequestHead();
    }
}
