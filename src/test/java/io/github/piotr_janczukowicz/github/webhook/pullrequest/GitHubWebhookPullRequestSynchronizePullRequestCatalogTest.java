package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestSynchronizePullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestSynchronizePullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-synchronize-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-synchronize-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestSynchronizePullRequest();
    }
}
