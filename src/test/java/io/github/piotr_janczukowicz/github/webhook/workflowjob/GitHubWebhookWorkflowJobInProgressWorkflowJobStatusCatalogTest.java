package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowJobInProgressWorkflowJobStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-in-progress-workflow-job-status-schema.json";
    }
}
