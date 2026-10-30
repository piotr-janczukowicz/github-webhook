package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentCreatedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentCreatedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-created-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-created-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedPullRequest();
    }
}
