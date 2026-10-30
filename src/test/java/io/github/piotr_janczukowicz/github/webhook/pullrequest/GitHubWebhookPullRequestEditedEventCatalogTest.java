package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestEditedEvent();
    }
}
