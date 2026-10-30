package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowJobInProgressWorkflowJobConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-in-progress-workflow-job-conclusion-schema.json";
    }
}
