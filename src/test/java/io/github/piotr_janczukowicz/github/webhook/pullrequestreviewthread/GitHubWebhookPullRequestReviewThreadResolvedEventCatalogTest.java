package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewThreadResolvedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewThreadResolvedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-thread-resolved-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-thread-resolved-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookPullRequestReviewThreadResolvedEvent();
    }
}
