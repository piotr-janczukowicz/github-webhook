package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCategoryChangedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCategoryChangedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-category-changed-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-category-changed-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionCategoryChangedChanges();
    }
}
