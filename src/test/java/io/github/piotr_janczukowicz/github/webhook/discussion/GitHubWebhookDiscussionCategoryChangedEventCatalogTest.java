package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCategoryChangedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCategoryChangedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-category-changed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-category-changed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionCategoryChangedEvent();
    }
}
