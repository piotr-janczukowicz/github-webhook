package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnassignedPullRequestBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnassignedPullRequestBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unassigned-pull-request-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unassigned-pull-request-base-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnassignedPullRequestBase();
    }
}
