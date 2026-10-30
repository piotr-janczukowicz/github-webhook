package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentEditedPullRequestBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentEditedPullRequestBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-edited-pull-request-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-edited-pull-request-base-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentEditedPullRequestBase();
    }
}
