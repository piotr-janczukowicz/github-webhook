package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedEvent();
    }
}
