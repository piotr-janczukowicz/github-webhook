package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewRequestedWorkflowJobRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRequestedWorkflowJobRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-requested-workflow-job-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-requested-workflow-job-run-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedWorkflowJobRun();
    }
}
