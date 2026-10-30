package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepoCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentCreatedPullRequestHeadRepo.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-created-pull-request-head-repo.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-created-pull-request-head-repo-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedPullRequestHeadRepo();
    }
}
