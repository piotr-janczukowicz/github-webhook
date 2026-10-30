package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentEditedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentEditedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-edited-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-edited-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentEditedPullRequest();
    }
}
