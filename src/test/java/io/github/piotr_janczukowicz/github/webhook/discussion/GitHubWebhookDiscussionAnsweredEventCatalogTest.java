package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionAnsweredEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionAnsweredEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-answered-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-answered-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionAnsweredEvent();
    }
}
