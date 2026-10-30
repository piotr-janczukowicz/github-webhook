package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAutoMergeEnabledPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAutoMergeEnabledPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-auto-merge-enabled-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-auto-merge-enabled-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestAutoMergeEnabledPullRequest();
    }
}
