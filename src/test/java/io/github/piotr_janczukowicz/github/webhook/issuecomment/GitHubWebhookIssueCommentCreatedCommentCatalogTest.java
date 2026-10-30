package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentCreatedCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentCreatedComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-created-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-created-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentCreatedComment();
    }
}
