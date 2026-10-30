package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentDeletedPullRequestAssigneeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentDeletedPullRequestAssignee.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-deleted-pull-request-assignee.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-deleted-pull-request-assignee-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentDeletedPullRequestAssignee();
    }
}
