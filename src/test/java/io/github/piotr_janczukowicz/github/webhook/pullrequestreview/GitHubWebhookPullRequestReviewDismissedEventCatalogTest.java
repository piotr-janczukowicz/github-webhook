package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewDismissedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewDismissedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-dismissed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-dismissed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedEvent();
    }
}
