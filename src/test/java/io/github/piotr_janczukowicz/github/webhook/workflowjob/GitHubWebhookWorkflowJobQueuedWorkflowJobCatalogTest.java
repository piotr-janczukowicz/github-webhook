package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobQueuedWorkflowJobCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobQueuedWorkflowJob.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-queued-workflow-job.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-queued-workflow-job-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedWorkflowJob();
    }
}
