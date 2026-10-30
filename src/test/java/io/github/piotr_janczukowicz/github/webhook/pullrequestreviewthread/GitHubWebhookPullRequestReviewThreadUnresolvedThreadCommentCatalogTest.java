package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewThreadUnresolvedThreadCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewThreadUnresolvedThreadComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-thread-unresolved-thread-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-thread-unresolved-thread-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedThreadComment();
    }
}
