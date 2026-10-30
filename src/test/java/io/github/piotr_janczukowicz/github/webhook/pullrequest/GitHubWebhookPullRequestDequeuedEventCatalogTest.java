package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestDequeuedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestDequeuedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-dequeued-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-dequeued-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestDequeuedEvent();
    }
}
