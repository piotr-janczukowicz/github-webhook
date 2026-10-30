package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCategoryChangedChangesCategoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCategoryChangedChangesCategory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-category-changed-changes-category.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-category-changed-changes-category-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionCategoryChangedChangesCategory();
    }
}
