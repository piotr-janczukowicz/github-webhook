package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionClosedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionClosedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-closed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-closed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionClosedEvent();
    }
}
