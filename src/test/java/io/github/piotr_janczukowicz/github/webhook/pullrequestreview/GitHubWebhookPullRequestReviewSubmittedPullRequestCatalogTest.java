package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewSubmittedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewSubmittedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-submitted-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-submitted-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedPullRequest();
    }
}
