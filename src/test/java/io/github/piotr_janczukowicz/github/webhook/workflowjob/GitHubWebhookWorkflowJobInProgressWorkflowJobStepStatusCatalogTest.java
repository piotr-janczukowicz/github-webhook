package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowJobInProgressWorkflowJobStepStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobStepStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-in-progress-workflow-job-step-status-schema.json";
    }
}
