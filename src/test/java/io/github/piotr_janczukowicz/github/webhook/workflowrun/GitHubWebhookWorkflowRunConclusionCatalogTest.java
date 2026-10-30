package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookWorkflowRunConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-conclusion-schema.json";
    }
}
