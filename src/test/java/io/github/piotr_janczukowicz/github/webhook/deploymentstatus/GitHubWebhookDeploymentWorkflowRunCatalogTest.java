package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentWorkflowRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentWorkflowRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-workflow-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-workflow-run-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentStatusCatalogFixtures.webhookDeploymentWorkflowRun();
    }
}
