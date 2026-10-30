package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionUnlabeledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionUnlabeledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-unlabeled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-unlabeled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionUnlabeledEvent();
    }
}
