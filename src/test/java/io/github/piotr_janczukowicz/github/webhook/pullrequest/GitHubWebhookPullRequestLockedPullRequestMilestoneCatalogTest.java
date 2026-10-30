package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLockedPullRequestMilestoneCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLockedPullRequestMilestone.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-locked-pull-request-milestone.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-locked-pull-request-milestone-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone();
    }
}
