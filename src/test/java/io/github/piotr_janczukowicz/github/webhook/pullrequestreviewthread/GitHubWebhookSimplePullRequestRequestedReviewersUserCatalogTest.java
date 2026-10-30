package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestRequestedReviewersUserCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequestRequestedReviewersUser.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request-requested-reviewers-user.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-requested-reviewers-user-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersUser();
    }
}
