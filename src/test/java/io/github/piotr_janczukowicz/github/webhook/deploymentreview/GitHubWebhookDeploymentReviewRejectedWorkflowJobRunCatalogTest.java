package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewRejectedWorkflowJobRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRejectedWorkflowJobRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-rejected-workflow-job-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-rejected-workflow-job-run-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowJobRun();
    }
}
