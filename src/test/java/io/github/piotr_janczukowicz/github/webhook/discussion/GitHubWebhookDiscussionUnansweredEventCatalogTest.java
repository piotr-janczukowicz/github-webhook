package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionUnansweredEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionUnansweredEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-unanswered-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-unanswered-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionUnansweredEvent();
    }
}
