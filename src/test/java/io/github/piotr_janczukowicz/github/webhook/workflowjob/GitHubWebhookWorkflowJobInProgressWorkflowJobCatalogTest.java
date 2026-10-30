package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobInProgressWorkflowJobCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJob.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-in-progress-workflow-job.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-in-progress-workflow-job-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressWorkflowJob();
    }
}
