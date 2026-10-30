package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLabeledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLabeledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-labeled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-labeled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLabeledEvent();
    }
}
