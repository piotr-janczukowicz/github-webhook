package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewEditedPullRequestBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewEditedPullRequestBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-edited-pull-request-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-edited-pull-request-base-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequestBase();
    }
}
