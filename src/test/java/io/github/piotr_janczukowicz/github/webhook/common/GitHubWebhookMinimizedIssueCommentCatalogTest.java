package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMinimizedIssueCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMinimizedIssueComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-minimized-issue-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-minimized-issue-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookMinimizedIssueComment();
    }
}
