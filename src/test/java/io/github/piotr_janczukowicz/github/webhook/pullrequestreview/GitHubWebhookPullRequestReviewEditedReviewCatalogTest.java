package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewEditedReviewCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewEditedReview.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-edited-review.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-edited-review-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReview();
    }
}
