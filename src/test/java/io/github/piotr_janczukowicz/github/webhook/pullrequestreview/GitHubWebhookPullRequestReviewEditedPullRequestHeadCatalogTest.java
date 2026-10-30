package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewEditedPullRequestHeadCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewEditedPullRequestHead.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-edited-pull-request-head.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-edited-pull-request-head-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestHead();
    }
}
