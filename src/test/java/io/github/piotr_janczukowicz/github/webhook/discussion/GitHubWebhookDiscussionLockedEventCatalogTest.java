package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionLockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionLockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-locked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-locked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionLockedEvent();
    }
}
