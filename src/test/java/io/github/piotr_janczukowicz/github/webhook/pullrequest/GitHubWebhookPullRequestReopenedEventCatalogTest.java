package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestReopenedEvent();
    }
}
