package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionReopenedEvent();
    }
}
