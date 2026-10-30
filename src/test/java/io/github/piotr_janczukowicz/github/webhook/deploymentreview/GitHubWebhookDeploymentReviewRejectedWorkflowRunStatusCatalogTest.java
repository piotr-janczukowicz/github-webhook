package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDeploymentReviewRejectedWorkflowRunStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-rejected-workflow-run-status-schema.json";
    }
}
