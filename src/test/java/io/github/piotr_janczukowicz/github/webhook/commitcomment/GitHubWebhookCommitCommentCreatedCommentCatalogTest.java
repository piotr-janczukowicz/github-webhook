package io.github.piotr_janczukowicz.github.webhook.commitcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCommitCommentCreatedCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitCommentCreatedComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-commit-comment-created-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-commit-comment-created-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return CommitCommentCatalogFixtures.webhookCommitCommentCreatedComment();
    }
}
