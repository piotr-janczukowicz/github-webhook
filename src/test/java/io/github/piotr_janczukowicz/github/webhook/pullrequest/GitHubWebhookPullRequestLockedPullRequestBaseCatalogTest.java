package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLockedPullRequestBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLockedPullRequestBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-locked-pull-request-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-locked-pull-request-base-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestBase();
    }
}
