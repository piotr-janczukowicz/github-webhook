package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItemCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItem.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-approved-workflow-job-runs-item.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-approved-workflow-job-runs-item-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedWorkflowJobRunsItem();
    }
}
