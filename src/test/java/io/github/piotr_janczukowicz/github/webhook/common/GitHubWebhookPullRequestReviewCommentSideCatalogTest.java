package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPullRequestReviewCommentSideCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentSide.class;
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-side-schema.json";
    }
}
