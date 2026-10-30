package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewDismissedReviewCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewDismissedReview.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-dismissed-review.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-dismissed-review-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewDismissedReview();
    }
}
