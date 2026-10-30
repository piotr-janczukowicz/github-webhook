package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueComment();
    }
}
