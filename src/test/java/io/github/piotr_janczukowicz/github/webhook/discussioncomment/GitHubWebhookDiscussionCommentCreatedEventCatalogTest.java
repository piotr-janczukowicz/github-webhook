package io.github.piotr_janczukowicz.github.webhook.discussioncomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCommentCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCommentCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-comment-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-comment-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCommentCatalogFixtures.webhookDiscussionCommentCreatedEvent();
    }
}
