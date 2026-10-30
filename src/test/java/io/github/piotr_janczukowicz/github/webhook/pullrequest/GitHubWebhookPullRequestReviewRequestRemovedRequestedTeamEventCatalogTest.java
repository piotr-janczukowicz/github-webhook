package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-request-removed-requested-team-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-request-removed-requested-team-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestReviewRequestRemovedRequestedTeamEvent();
    }
}
