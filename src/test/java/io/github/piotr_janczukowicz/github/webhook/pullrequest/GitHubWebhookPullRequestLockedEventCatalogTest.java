package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-locked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-locked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLockedEvent();
    }
}
