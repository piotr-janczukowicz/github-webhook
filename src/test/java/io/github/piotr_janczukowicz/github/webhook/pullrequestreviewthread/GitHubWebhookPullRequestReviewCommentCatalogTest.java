package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewComment();
    }
}
