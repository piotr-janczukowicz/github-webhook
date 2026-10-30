package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLockedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLockedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-locked-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-locked-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLockedPullRequest();
    }
}
