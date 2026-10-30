package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReadyForReviewEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReadyForReviewEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-ready-for-review-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-ready-for-review-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestReadyForReviewEvent();
    }
}
