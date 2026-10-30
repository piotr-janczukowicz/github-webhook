package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestDequeuedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestDequeuedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-dequeued-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-dequeued-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequest();
    }
}
