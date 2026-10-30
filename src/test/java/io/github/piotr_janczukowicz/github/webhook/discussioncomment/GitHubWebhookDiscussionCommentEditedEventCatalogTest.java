package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCommentEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCommentEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-comment-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-comment-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCommentCatalogFixtures.webhookDiscussionCommentEditedEvent();
    }
}
