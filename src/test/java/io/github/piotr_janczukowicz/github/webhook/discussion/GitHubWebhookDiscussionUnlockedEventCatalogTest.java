package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionUnlockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionUnlockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-unlocked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-unlocked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionUnlockedEvent();
    }
}
