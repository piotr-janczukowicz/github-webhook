package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionPinnedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionPinnedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-pinned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-pinned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionPinnedEvent();
    }
}
