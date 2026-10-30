package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionLabeledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionLabeledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-labeled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-labeled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionLabeledEvent();
    }
}
