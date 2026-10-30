package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAutoMergeEnabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAutoMergeEnabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-auto-merge-enabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-auto-merge-enabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledEvent();
    }
}
