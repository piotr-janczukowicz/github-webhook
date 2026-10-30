package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentEditedPullRequestHeadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentEditedPullRequestHead.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-edited-pull-request-head.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-edited-pull-request-head-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentEditedPullRequestHead();
    }
}
