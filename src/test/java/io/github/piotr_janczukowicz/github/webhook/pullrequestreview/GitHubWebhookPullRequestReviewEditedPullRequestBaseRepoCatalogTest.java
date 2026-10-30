package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewEditedPullRequestBaseRepoCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewEditedPullRequestBaseRepo.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-edited-pull-request-base-repo.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-edited-pull-request-base-repo-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBaseRepo();
    }
}
