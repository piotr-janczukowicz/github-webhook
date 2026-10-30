package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryLiteCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryLite.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-lite.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-lite-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookRepositoryLite();
    }
}
