package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRun();
    }
}
