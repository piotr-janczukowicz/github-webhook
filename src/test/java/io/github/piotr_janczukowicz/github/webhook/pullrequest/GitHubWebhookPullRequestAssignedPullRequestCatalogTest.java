package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAssignedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAssignedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-assigned-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-assigned-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestAssignedPullRequest();
    }
}
