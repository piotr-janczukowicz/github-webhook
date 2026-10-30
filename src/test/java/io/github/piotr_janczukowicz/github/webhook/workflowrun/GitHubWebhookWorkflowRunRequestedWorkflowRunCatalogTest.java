package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunRequestedWorkflowRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunRequestedWorkflowRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-requested-workflow-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-requested-workflow-run-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedWorkflowRun();
    }
}
