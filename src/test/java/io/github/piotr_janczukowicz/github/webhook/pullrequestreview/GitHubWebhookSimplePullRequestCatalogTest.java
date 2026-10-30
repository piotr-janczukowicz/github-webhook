package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookSimplePullRequest();
    }
}
