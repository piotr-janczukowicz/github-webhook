package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnlockedPullRequestHeadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnlockedPullRequestHead.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unlocked-pull-request-head.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unlocked-pull-request-head-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequestHead();
    }
}
