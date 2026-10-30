package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewRequestedRequestedReviewerPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-requested-requested-reviewer-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-requested-requested-reviewer-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedReviewerPullRequest();
    }
}
