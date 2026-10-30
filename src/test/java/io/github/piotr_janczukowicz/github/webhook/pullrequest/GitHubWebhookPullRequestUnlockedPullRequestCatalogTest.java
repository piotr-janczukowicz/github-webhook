package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnlockedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnlockedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unlocked-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unlocked-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequest();
    }
}
