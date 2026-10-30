package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentCreatedCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentCreatedComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-created-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-created-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedComment();
    }
}
