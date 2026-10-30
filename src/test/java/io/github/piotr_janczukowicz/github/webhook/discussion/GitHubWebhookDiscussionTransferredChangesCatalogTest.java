package io.github.piotr_janczukowicz.github.webhook.discussion;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDiscussionTransferredChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionTransferredChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-discussion-transferred-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-discussion-transferred-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return DiscussionCatalogFixtures.webhookDiscussionTransferredChanges();
    }
}
