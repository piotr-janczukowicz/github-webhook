package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewThreadUnresolvedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewThreadUnresolvedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-thread-unresolved-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-thread-unresolved-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadUnresolvedEvent();
    }
}
