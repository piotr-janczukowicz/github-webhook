package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestUnlabeledPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestUnlabeledPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-unlabeled-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-unlabeled-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestUnlabeledPullRequest();
    }
}
