package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunInProgressWorkflowRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunInProgressWorkflowRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-in-progress-workflow-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-in-progress-workflow-run-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRun();
    }
}
