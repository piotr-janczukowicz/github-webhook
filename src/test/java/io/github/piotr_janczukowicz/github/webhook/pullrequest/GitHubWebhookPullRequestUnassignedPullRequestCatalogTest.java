package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnassignedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnassignedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unassigned-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unassigned-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequest();
    }
}
