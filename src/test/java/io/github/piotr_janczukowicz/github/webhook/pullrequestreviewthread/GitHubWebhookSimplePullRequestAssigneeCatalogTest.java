package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestAssigneeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequestAssignee.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request-assignee.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-assignee-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestAssignee();
    }
}
