package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionTransferredEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionTransferredEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-transferred-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-transferred-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionTransferredEvent();
    }
}
