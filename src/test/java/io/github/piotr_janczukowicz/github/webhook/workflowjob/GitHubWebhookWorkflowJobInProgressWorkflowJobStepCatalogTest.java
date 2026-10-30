package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobInProgressWorkflowJobStepCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobStep.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-in-progress-workflow-job-step.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-in-progress-workflow-job-step-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJobStep();
    }
}
