package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionUnpinnedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionUnpinnedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-unpinned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-unpinned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionUnpinnedEvent();
    }
}
