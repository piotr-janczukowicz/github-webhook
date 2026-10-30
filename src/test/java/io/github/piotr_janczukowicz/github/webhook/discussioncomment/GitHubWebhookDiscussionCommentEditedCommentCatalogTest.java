package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCommentEditedCommentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCommentEditedComment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-comment-edited-comment.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-comment-edited-comment-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedComment();
    }
}
