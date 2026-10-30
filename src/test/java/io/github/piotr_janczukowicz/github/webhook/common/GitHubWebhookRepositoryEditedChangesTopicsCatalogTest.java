package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryEditedChangesTopicsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryEditedChangesTopics.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-edited-changes-topics.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-edited-changes-topics-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRepositoryEditedChangesTopics();
    }
}
