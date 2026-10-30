package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAssignedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAssignedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-assigned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-assigned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestAssignedEvent();
    }
}
