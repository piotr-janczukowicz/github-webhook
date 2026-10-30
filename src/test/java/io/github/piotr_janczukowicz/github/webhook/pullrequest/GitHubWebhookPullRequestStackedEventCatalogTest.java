package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestStackedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestStackedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-stacked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-stacked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestStackedEvent();
    }
}
