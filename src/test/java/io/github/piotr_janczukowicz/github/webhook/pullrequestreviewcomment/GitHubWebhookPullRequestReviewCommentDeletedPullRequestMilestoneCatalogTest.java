package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentDeletedPullRequestMilestoneCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentDeletedPullRequestMilestone.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-deleted-pull-request-milestone.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-deleted-pull-request-milestone-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentDeletedPullRequestMilestone();
    }
}
