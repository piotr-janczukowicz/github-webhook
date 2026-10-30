package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestDequeuedPullRequestBaseRepoCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestDequeuedPullRequestBaseRepo.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-dequeued-pull-request-base-repo.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-dequeued-pull-request-base-repo-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestDequeuedPullRequestBaseRepo();
    }
}
