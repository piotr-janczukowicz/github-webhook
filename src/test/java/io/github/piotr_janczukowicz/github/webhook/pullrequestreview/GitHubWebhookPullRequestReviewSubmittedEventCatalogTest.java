package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewSubmittedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewSubmittedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-submitted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-submitted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewSubmittedEvent();
    }
}
