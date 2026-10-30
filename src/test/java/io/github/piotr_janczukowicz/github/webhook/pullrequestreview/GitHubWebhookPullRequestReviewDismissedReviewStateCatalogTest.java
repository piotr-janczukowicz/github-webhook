package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPullRequestReviewDismissedReviewStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewDismissedReviewState.class;
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-dismissed-review-state-schema.json";
    }
}
