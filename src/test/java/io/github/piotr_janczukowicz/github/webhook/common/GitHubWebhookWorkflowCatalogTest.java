package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflow.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookWorkflow();
    }
}
