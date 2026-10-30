package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAutoMergeDisabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAutoMergeDisabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-auto-merge-disabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-auto-merge-disabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledEvent();
    }
}
