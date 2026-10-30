package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewRequestedRequestedTeamPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-requested-requested-team-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-requested-requested-team-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamPullRequest();
    }
}
