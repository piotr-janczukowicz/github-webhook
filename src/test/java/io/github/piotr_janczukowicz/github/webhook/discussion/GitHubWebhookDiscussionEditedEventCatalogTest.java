package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionEditedEvent();
    }
}
