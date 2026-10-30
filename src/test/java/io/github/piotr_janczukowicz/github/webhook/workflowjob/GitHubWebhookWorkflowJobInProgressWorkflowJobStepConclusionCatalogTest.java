package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-in-progress-workflow-job-step-conclusion-schema.json";
    }
}
