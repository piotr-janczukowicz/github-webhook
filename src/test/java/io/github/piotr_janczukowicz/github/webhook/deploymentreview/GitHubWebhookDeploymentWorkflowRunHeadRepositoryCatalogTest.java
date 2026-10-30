package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentWorkflowRunHeadRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentWorkflowRunHeadRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-workflow-run-head-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-workflow-run-head-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentWorkflowRunHeadRepository();
    }
}
