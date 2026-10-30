package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestSynchronizeEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestSynchronizeEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-synchronize-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-synchronize-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestSynchronizeEvent();
    }
}
