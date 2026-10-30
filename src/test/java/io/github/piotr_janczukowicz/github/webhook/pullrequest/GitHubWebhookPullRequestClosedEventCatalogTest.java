package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestClosedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestClosedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-closed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-closed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestClosedEvent();
    }
}
