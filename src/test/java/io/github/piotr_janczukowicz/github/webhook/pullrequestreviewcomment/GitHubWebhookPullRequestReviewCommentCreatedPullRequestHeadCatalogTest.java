package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentCreatedPullRequestHead.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-created-pull-request-head.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-created-pull-request-head-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedPullRequestHead();
    }
}
