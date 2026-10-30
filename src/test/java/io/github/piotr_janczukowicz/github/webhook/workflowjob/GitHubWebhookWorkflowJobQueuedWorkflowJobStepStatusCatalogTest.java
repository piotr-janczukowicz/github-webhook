package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-queued-workflow-job-step-status-schema.json";
    }
}
