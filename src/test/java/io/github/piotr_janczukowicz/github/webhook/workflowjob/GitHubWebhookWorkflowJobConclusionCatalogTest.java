package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowJobConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-conclusion-schema.json";
    }
}
