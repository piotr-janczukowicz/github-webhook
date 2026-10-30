package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestStackedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestStackedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-stacked-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-stacked-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestStackedPullRequest();
    }
}
