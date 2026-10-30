package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionDeletedEvent();
    }
}
