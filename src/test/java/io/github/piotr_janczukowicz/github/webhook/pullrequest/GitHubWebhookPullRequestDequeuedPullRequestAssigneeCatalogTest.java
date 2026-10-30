package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestDequeuedPullRequestAssigneeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestDequeuedPullRequestAssignee.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-dequeued-pull-request-assignee.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-dequeued-pull-request-assignee-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestAssignee();
    }
}
