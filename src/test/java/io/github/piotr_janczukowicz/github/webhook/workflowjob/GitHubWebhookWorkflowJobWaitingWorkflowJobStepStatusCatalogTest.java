package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-waiting-workflow-job-step-status-schema.json";
    }
}
