package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewRequestedRequestedReviewerEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewRequestedRequestedReviewerEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-requested-requested-reviewer-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-requested-requested-reviewer-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedReviewerEvent();
    }
}
