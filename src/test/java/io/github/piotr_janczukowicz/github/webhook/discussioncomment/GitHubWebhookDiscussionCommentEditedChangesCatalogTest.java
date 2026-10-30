package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCommentEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCommentEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-comment-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-comment-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedChanges();
    }
}
