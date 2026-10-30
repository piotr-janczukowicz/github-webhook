package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestDemilestonedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestDemilestonedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-demilestoned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-demilestoned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestDemilestonedEvent();
    }
}
