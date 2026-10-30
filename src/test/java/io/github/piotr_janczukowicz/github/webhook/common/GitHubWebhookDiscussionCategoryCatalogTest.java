package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionCategoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionCategory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-category.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-category-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookDiscussionCategory();
    }
}
