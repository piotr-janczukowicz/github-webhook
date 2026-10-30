package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestBaseRepoCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequestBaseRepo.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request-base-repo.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-base-repo-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookSimplePullRequestBaseRepo();
    }
}
