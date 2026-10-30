package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMergeQueueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeQueue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-merge-queue.json";
    }

    @Override
    protected String schema() {
        return "webhook-merge-queue-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookMergeQueue();
    }
}
