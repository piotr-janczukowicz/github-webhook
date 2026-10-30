package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestMilestonedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestMilestonedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-milestoned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-milestoned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestMilestonedEvent();
    }
}
