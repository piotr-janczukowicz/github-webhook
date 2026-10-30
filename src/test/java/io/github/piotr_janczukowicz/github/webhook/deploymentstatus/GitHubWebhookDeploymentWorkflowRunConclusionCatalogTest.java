package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDeploymentWorkflowRunConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentWorkflowRunConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-deployment-workflow-run-conclusion-schema.json";
    }
}
