package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnlabeledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnlabeledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unlabeled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unlabeled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnlabeledEvent();
    }
}
