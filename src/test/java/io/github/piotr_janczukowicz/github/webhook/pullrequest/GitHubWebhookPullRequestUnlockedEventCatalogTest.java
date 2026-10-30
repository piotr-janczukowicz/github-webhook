package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnlockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnlockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unlocked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unlocked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnlockedEvent();
    }
}
