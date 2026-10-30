package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJob.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJob();
    }
}
