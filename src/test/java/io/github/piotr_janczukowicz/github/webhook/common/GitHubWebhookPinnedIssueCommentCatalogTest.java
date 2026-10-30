package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPinnedIssueCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPinnedIssueComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pinned-issue-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-pinned-issue-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPinnedIssueComment();
    }
}
