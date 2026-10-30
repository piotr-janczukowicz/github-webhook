package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestOpenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestOpenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-opened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-opened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestOpenedEvent();
    }
}
