package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewRejectedWorkflowRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRejectedWorkflowRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-rejected-workflow-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-rejected-workflow-run-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowRun();
    }
}
