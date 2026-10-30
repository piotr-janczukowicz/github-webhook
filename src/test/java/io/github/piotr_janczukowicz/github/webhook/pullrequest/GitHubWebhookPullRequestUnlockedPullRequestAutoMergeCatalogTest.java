package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnlockedPullRequestAutoMergeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnlockedPullRequestAutoMerge.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unlocked-pull-request-auto-merge.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unlocked-pull-request-auto-merge-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnlockedPullRequestAutoMerge();
    }
}
