package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobQueuedWorkflowJobStepCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobQueuedWorkflowJobStep.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-queued-workflow-job-step.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-queued-workflow-job-step-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJobStep();
    }
}
