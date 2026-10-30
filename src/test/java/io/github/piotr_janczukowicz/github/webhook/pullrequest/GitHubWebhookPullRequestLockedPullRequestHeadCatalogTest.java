package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLockedPullRequestHeadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLockedPullRequestHead.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-locked-pull-request-head.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-locked-pull-request-head-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestHead();
    }
}
