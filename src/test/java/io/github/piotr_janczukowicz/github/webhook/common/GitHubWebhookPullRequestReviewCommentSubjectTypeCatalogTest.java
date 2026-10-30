package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPullRequestReviewCommentSubjectTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentSubjectType.class;
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-subject-type-schema.json";
    }
}
