package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestEnqueuedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestEnqueuedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-enqueued-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-enqueued-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestEnqueuedEvent();
    }
}
