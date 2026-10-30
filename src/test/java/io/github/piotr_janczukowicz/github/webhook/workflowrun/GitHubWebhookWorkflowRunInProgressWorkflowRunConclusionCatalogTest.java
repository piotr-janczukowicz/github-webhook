package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowRunInProgressWorkflowRunConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunInProgressWorkflowRunConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-in-progress-workflow-run-conclusion-schema.json";
    }
}
