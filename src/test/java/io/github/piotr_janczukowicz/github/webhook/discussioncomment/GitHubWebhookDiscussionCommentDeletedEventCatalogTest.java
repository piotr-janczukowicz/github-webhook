package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCommentDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCommentDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-comment-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-comment-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCommentCatalogFixtures.webhookDiscussionCommentDeletedEvent();
    }
}
