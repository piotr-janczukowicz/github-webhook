package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionCreatedEvent();
    }
}
