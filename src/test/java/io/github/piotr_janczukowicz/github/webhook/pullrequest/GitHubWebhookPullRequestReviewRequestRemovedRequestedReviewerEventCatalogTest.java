package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewRequestRemovedRequestedReviewerEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewRequestRemovedRequestedReviewerEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-request-removed-requested-reviewer-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-request-removed-requested-reviewer-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestReviewRequestRemovedRequestedReviewerEvent();
    }
}
