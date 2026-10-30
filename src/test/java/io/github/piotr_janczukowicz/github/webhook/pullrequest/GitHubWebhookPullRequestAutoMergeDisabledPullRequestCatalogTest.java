package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAutoMergeDisabledPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAutoMergeDisabledPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-auto-merge-disabled-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-auto-merge-disabled-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestAutoMergeDisabledPullRequest();
    }
}
