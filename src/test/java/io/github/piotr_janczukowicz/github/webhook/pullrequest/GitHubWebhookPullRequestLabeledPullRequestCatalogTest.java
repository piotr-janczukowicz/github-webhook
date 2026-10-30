package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLabeledPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLabeledPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-labeled-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-labeled-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLabeledPullRequest();
    }
}
