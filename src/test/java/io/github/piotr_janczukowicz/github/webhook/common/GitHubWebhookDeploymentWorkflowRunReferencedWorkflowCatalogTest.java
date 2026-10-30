package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentWorkflowRunReferencedWorkflowCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentWorkflowRunReferencedWorkflow.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-workflow-run-referenced-workflow.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-workflow-run-referenced-workflow-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookDeploymentWorkflowRunReferencedWorkflow();
    }
}
