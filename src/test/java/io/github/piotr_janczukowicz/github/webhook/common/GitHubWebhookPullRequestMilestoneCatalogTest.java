package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestMilestoneCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestMilestone.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-milestone.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-milestone-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPullRequestMilestone();
    }
}
