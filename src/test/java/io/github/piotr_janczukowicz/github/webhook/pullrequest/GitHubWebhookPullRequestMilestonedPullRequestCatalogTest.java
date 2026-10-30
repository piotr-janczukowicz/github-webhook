package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestMilestonedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestMilestonedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-milestoned-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-milestoned-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestMilestonedPullRequest();
    }
}
