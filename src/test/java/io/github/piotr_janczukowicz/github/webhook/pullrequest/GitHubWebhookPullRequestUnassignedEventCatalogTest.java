package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnassignedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnassignedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unassigned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unassigned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnassignedEvent();
    }
}
